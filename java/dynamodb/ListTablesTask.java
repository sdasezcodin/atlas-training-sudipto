package io.smarthome;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.ListTablesRequest;
import software.amazon.awssdk.services.dynamodb.model.ListTablesResponse;

public class ListTablesTask {

    public static void main(String[] args) {
        // Get the DynamoDbClient instance
        DynamoDbClient dynamoDbClient = DynamoDBConnection.getInstance();

        // Build request to list tables
        ListTablesRequest request = ListTablesRequest.builder()
                .limit(100)  // Adjust limit if needed
                .build();

        // Execute and get response
        ListTablesResponse response = dynamoDbClient.listTables(request);

        // Print table names
        System.out.println("Tables in DynamoDB Local:");
        response.tableNames().forEach(System.out::println);

        // Close connection
        DynamoDBConnection.closeConnection();
    }
}
