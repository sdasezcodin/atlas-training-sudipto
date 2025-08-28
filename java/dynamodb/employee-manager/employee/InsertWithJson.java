package com.dynamodb.employee;

import com.dynamodb.connection.DDBConnection;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InsertWithJson {

    public static void insertEmployeesFromJSON(String tableName) throws Exception {
        if (tableName == null || tableName.isEmpty()) {
            System.out.println("No table selected! Please create or select a table first.");
            return;
        }

        DynamoDbClient dynamoDb = DDBConnection.getConnection();

        ObjectMapper mapper = new ObjectMapper();
        InputStream jsonStream = InsertWithJson.class.getClassLoader()
                .getResourceAsStream("Employee.json");

        if (jsonStream == null) {
            System.err.println("Employee.json not found in resources!");
            return;
        }

        JsonNode rootNode = mapper.readTree(jsonStream);
        Iterator<JsonNode> iterator = rootNode.elements();

        while (iterator.hasNext()) {
            JsonNode node = iterator.next();
            String id = node.get("ID").asText();

            Map<String, AttributeValue> key = new HashMap<>();
            key.put("ID", AttributeValue.builder().n(id).build());

            boolean exists = dynamoDb.getItem(GetItemRequest.builder()
                            .tableName(tableName)
                            .key(key)
                            .build())
                    .hasItem();

            if (exists) {
                System.out.println("Skipped (duplicate ID): " + id + " | " + node.get("Name").asText());
                continue;
            }

            Map<String, AttributeValue> item = new HashMap<>();
            item.put("ID", AttributeValue.builder().n(id).build());
            item.put("Name", AttributeValue.builder().s(node.get("Name").asText()).build());
            item.put("NomenClature", AttributeValue.builder().s(node.get("NomenClature").asText()).build());

            PutItemRequest putReq = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();

            dynamoDb.putItem(putReq);
            System.out.println("Inserted: " + id + " | " + node.get("Name").asText());
        }

        System.out.println("\nFinished processing JSON. Table '" + tableName + "' updated.");
    }
}
