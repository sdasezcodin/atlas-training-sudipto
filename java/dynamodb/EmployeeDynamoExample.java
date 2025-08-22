package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeDynamoExample {

    public static void main(String[] args) throws Exception {

        // Setup DynamoDB client (Local)
        AwsBasicCredentials awsCreds = AwsBasicCredentials.create("dummy", "dummy");
        DynamoDbClient dynamoDb = DynamoDbClient.builder()
                .endpointOverride(URI.create("http://localhost:8000"))
                .region(Region.AP_SOUTH_1) // Mumbai
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
                .build();

        String tableName = "Employee";

        // Create Table if not exists
        try {
            CreateTableRequest request = CreateTableRequest.builder()
                    .tableName(tableName)
                    .keySchema(KeySchemaElement.builder()
                            .attributeName("ID")
                            .keyType(KeyType.HASH)
                            .build())
                    .attributeDefinitions(AttributeDefinition.builder()
                            .attributeName("ID")
                            .attributeType(ScalarAttributeType.N)
                            .build())
                    .provisionedThroughput(ProvisionedThroughput.builder()
                            .readCapacityUnits(5L)
                            .writeCapacityUnits(5L)
                            .build())
                    .build();

            dynamoDb.createTable(request);
            System.out.println("Table created: " + tableName);
        } catch (ResourceInUseException e) {
            System.out.println("Table already exists: " + tableName);
        }

        // Load JSON from resources
        ObjectMapper mapper = new ObjectMapper();
        InputStream jsonStream = EmployeeDynamoExample.class.getClassLoader()
                .getResourceAsStream("Employee.json");

        if (jsonStream == null) {
            System.err.println("Employee.json not found in resources!");
            System.exit(1);
        }

        JsonNode rootNode = mapper.readTree(jsonStream);
        Iterator<JsonNode> iterator = rootNode.elements();

        // Insert data
        while (iterator.hasNext()) {
            JsonNode node = iterator.next();
            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(node.get("ID").asText()).build());
            item.put("Name", AttributeValue.builder().s(node.get("Name").asText()).build());
            item.put("NomenClature", AttributeValue.builder().s(node.get("NomenClature").asText()).build());

            PutItemRequest putReq = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();

            dynamoDb.putItem(putReq);
            System.out.println("Inserted: " + node.get("ID").asInt() + " | " + node.get("Name").asText());
        }

        // Retrieve and print all items
        ScanRequest scanRequest = ScanRequest.builder()
                .tableName(tableName)
                .build();

        ScanResponse scanResponse = dynamoDb.scan(scanRequest);
        System.out.println("\nAll items in table:");
        for (Map<String, AttributeValue> dbItem : scanResponse.items()) {
            System.out.println(dbItem);
        }

        dynamoDb.close();
    }
}
