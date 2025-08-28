package com.dynamodb.table;

import com.dynamodb.connection.DDBConnection;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.ListTablesResponse;

import java.util.List;
import java.util.Scanner;

public class SelectTable {

    public static String selectTable() {
        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        ListTablesResponse tables = dynamoDb.listTables();
        List<String> tableNames = tables.tableNames();

        if (tableNames.isEmpty()) {
            System.out.println("No tables found. Please create a table first.");
            return null;
        }

        System.out.println("\nExisting tables:");
        tableNames.forEach(t -> System.out.println(" - " + t));

        System.out.print("Enter table name to select: ");
        String selected = sc.nextLine().trim();

        if (!tableNames.contains(selected)) {
            System.out.println("Table '" + selected + "' does not exist.");
            return null;
        }

        System.out.println("Table '" + selected + "' is now active.");
        return selected;
    }
}
