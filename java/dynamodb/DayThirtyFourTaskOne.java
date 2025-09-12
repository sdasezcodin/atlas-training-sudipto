package com;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayThirtyFourTaskOne {
    public static void main(String[] args) {
        DynamoDbClient dynamoDb = DayThirtyFourDynamoDBConnection.getInstance();
        String tableName = "Appliances001";

        // ----------------- Create Table -----------------
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

        // ----------------- Insert Sample Data -----------------
        putItem(dynamoDb, tableName, "A1", "Smart Light", "Philips", true, true, 12, 75);
        putItem(dynamoDb, tableName, "A2", "Smart Fan", "Orient", false, true, 50, 40);
        putItem(dynamoDb, tableName, "A3", "Smart AC", "Samsung", true, false, 1200, 20);
        System.out.println("Sample data inserted successfully!");

        // ----------------- Retrieve & Display All Items -----------------
        ScanResponse response = dynamoDb.scan(ScanRequest.builder()
                .tableName(tableName)
                .build());
        List<Map<String, AttributeValue>> items = response.items();

        String format = "| %-4s | %-12s | %-10s | %-5s | %-6s | %-10s | %-5s |%n";
        String line = "+------+--------------+------------+-------+--------+------------+-------+";

        System.out.println(line);
        System.out.printf(format, "ID", "Name", "Brand", "On", "Online", "PowerUsage", "Level");
        System.out.println(line);

        for (Map<String, AttributeValue> item : items) {
            System.out.printf(format,
                    item.get("id").s(),
                    item.get("name").s(),
                    item.get("brand").s(),
                    item.get("on").bool(),
                    item.get("online").bool(),
                    item.get("powerUsage").n(),
                    item.get("level").n());
        }
        System.out.println(line);

        // Close connection
        DayThirtyFourDynamoDBConnection.closeConnection();
    }

    private static void putItem(DynamoDbClient dynamoDb, String tableName, String id, String name, String brand,
                                boolean on, boolean online, int powerUsage, int level) {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("id", AttributeValue.builder().s(id).build());
        item.put("name", AttributeValue.builder().s(name).build());
        item.put("brand", AttributeValue.builder().s(brand).build());
        item.put("on", AttributeValue.builder().bool(on).build());
        item.put("online", AttributeValue.builder().bool(online).build());
        item.put("powerUsage", AttributeValue.builder().n(String.valueOf(powerUsage)).build());
        item.put("level", AttributeValue.builder().n(String.valueOf(level)).build());

        dynamoDb.putItem(PutItemRequest.builder()
                .tableName(tableName)
                .item(item)
                .build());
    }
}



















