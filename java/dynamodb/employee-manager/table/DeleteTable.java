package com.dynamodb.table;

import com.dynamodb.connection.DDBConnection;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.util.Scanner;

public class DeleteTable {

    public static void deleteTable() {
        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the table name to delete: ");
        String tableToDelete = sc.nextLine().trim();

        try {
            dynamoDb.deleteTable(r -> r.tableName(tableToDelete));
            System.out.println("Table '" + tableToDelete + "' deleted successfully.");
        } catch (Exception e) {
            System.out.println("Error deleting table: " + e.getMessage());
        }
    }
}
