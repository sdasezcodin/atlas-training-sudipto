package com;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.HashMap;
import java.util.Map;

public class DayThirtyFourTaskTwo {
    public static void main(String[] args) {
        DynamoDbClient dynamoDb = DayThirtyFourDynamoDBConnection.getInstance();
        String tableName = "Task02Appliances";

        try {
            CreateTableRequest createTableRequest = CreateTableRequest.builder()
                    .tableName(tableName)
                    .keySchema(KeySchemaElement.builder()
                            .attributeName("id")
                            .keyType(KeyType.HASH)
                            .build())
                    .attributeDefinitions(AttributeDefinition.builder()
                            .attributeName("id")
                            .attributeType(ScalarAttributeType.S)
                            .build())
                    .provisionedThroughput(ProvisionedThroughput.builder()
                            .readCapacityUnits(5L)
                            .writeCapacityUnits(5L)
                            .build())
                    .build();

            dynamoDb.createTable(createTableRequest);
            System.out.println("Table '" + tableName + "' created successfully!");
        } catch (ResourceInUseException e) {
            System.out.println("Table '" + tableName + "' already exists, skipping creation.");
        }

        putItem(dynamoDb, tableName, "I1", "Smart Light", "Philips", true, true);
        putItem(dynamoDb, tableName, "I2", "Smart Fan", "Orient", false, true);
        System.out.println("2 sample items inserted successfully!");

        // Close connection
        DayThirtyFourDynamoDBConnection.closeConnection();
    }

    private static void putItem(DynamoDbClient dynamoDb, String tableName, String id, String name, String brand,
                                boolean on, boolean online) {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("id", AttributeValue.builder().s(id).build());
        item.put("name", AttributeValue.builder().s(name).build());
        item.put("brand", AttributeValue.builder().s(brand).build());
        item.put("on", AttributeValue.builder().bool(on).build());
        item.put("online", AttributeValue.builder().bool(online).build());

        dynamoDb.putItem(PutItemRequest.builder()
                .tableName(tableName)
                .item(item)
                .build());
    }
}
