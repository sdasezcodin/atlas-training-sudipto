package com.dynamodb.employee;

import com.dynamodb.connection.DDBConnection;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadEmployee {

    public static void searchById(String tableName) {
        if (tableName == null || tableName.isEmpty()) {
            System.out.println("No table selected! Please create or select a table first.");
            return;
        }

        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Employee ID to search: ");
        String input = sc.nextLine().trim();

        Map<String, AttributeValue> keyToSearch = new HashMap<>();
        keyToSearch.put("ID", AttributeValue.builder().n(input).build());

        try {
            GetItemResponse getRes = dynamoDb.getItem(b -> b.tableName(tableName).key(keyToSearch));

            if (getRes.hasItem()) {
                Map<String, AttributeValue> emp = getRes.item();
                String id = emp.containsKey("ID") ? emp.get("ID").n() : "N/A";
                String name = emp.containsKey("Name") ? emp.get("Name").s() : "N/A";
                String role = emp.containsKey("NomenClature") ? emp.get("NomenClature").s() : "N/A";

                System.out.println("\nEmployee found:");
                System.out.println("ID: " + id + " | Name: " + name + " | NomenClature: " + role);
            } else {
                System.out.println("No employee found with ID " + input);
            }

        } catch (Exception e) {
            System.out.println("Error fetching employee: " + e.getMessage());
        }
    }

    public static void showTableAndSearch(String tableName) {
        if (tableName == null || tableName.isEmpty()) {
            System.out.println("No table selected! Please create or select a table first.");
            return;
        }

        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        try {
            ScanResponse scanResponse = dynamoDb.scan(req -> req.tableName(tableName));

            if (scanResponse.count() == 0) {
                System.out.println("Table '" + tableName + "' is empty.");
                return;
            }

            // Print each employee as a simple line
            System.out.println("\nEmployees in table: " + tableName);
            for (Map<String, AttributeValue> item : scanResponse.items()) {
                String id = item.containsKey("ID") ? item.get("ID").n() : "N/A";
                String name = item.containsKey("Name") ? item.get("Name").s() : "N/A";
                String role = item.containsKey("NomenClature") ? item.get("NomenClature").s() : "N/A";
                System.out.println("ID: " + id + " | Name: " + name + " | NomenClature: " + role);
            }

            System.out.print("\nEnter Employee ID to search: ");
            String input = sc.nextLine().trim();

            Map<String, AttributeValue> keyToSearch = new HashMap<>();
            keyToSearch.put("ID", AttributeValue.builder().n(input).build());

            GetItemResponse getRes = dynamoDb.getItem(b -> b.tableName(tableName).key(keyToSearch));

            if (getRes.hasItem()) {
                Map<String, AttributeValue> emp = getRes.item();
                String id = emp.containsKey("ID") ? emp.get("ID").n() : "N/A";
                String name = emp.containsKey("Name") ? emp.get("Name").s() : "N/A";
                String role = emp.containsKey("NomenClature") ? emp.get("NomenClature").s() : "N/A";

                System.out.println("\nEmployee found:");
                System.out.println("ID: " + id + " | Name: " + name + " | NomenClature: " + role);
            } else {
                System.out.println("\nNo employee found with ID " + input);
            }

        } catch (ResourceNotFoundException e) {
            System.out.println("Table '" + tableName + "' does not exist.");
        } catch (Exception e) {
            System.out.println("Error while reading table: " + e.getMessage());
        }
    }
}
