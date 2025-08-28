package com.dynamodb.table;

import com.dynamodb.connection.DDBConnection;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.Scanner;

public class AddTable {

    public static String createTableWithUserInput() {
        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter table name to create: ");
        String tableName = sc.nextLine().trim();

        System.out.print("Enter primary key name (use type Number): ");
        String primaryKey = sc.nextLine().trim();

        try {
            ListTablesResponse tables = dynamoDb.listTables();
            if (tables.tableNames().contains(tableName)) {
                System.out.println("Table '" + tableName + "' already exists.");
                return tableName;
            }

            CreateTableRequest request = CreateTableRequest.builder()
                    .tableName(tableName)
                    .keySchema(KeySchemaElement.builder()
                            .attributeName(primaryKey)
                            .keyType(KeyType.HASH)
                            .build())
                    .attributeDefinitions(AttributeDefinition.builder()
                            .attributeName(primaryKey)
                            .attributeType(ScalarAttributeType.N)
                            .build())
                    .provisionedThroughput(ProvisionedThroughput.builder()
                            .readCapacityUnits(5L)
                            .writeCapacityUnits(5L)
                            .build())
                    .build();

            dynamoDb.createTable(request);
            System.out.println("Table '" + tableName + "' created successfully with primary key '" + primaryKey + "'.");

        } catch (DynamoDbException e) {
            System.err.println("Error creating table: " + e.getMessage());
        }

        return tableName;
    }
}
