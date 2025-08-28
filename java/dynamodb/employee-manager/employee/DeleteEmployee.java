package com.dynamodb.employee;

import com.dynamodb.connection.DDBConnection;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.*;

public class DeleteEmployee {

    public static void deleteEmployeeById(String tableName) {
        if (tableName == null || tableName.isEmpty()) {
            System.out.println("No table selected! Please create or select a table first.");
            return;
        }

        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Employee ID to delete: ");
        int inputId = sc.nextInt();

        Map<String, AttributeValue> keyToDelete = new HashMap<>();
        keyToDelete.put("ID", AttributeValue.builder().n(String.valueOf(inputId)).build());

        GetItemResponse getRes = dynamoDb.getItem(builder -> builder.tableName(tableName).key(keyToDelete));

        if (getRes.hasItem()) {
            System.out.println("Employee found: " +
                    getRes.item().get("ID").n() + " | " +
                    getRes.item().get("Name").s());

            System.out.print("Do you want to delete this employee? (y/n): ");
            String confirm = sc.next().trim().toLowerCase();
            if (confirm.equals("y")) {
                dynamoDb.deleteItem(builder -> builder.tableName(tableName).key(keyToDelete));
                System.out.println("Employee with ID " + inputId + " deleted.");
            } else {
                System.out.println("Deletion canceled.");
            }

        } else {
            System.out.println("No employee found with ID " + inputId);
        }

        ScanResponse afterDelete = dynamoDb.scan(builder -> builder.tableName(tableName));
        List<Map<String, AttributeValue>> sortedItems = new ArrayList<>(afterDelete.items());
        sortedItems.sort(Comparator.comparingInt(item -> Integer.parseInt(item.get("ID").n())));

        System.out.println("\nRemaining employees in table '" + tableName + "':");
        for (Map<String, AttributeValue> dbItem : sortedItems) {
            System.out.println(dbItem.get("ID").n() + " | " + dbItem.get("Name").s());
        }
    }
}
