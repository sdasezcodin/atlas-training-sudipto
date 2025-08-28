package com.dynamodb.employee;

import com.dynamodb.connection.DDBConnection;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateEmployee {

    public static void updateEmployee(String tableName) {
        if (tableName == null || tableName.isEmpty()) {
            System.out.println("No table selected! Please create or select a table first.");
            return;
        }

        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);
        String empId;

        while (true) {
            System.out.print("\nEnter Employee ID to update: ");
            empId = sc.nextLine().trim();
            if (empId.isEmpty()) {
                System.out.println("Employee ID cannot be empty.");
                continue;
            }
            try {
                Long.parseLong(empId); // validate number
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a numeric value.");
            }
        }

        Map<String, AttributeValue> key = new HashMap<>();
        key.put("ID", AttributeValue.builder().n(empId).build());

        try {
            boolean exists = dynamoDb.getItem(GetItemRequest.builder()
                            .tableName(tableName)
                            .key(key)
                            .build())
                    .hasItem();

            if (!exists) {
                System.out.println("Error: Employee with ID " + empId + " not found in table '" + tableName + "'.");
                return;
            }
        } catch (DynamoDbException e) {
            System.out.println("Error accessing DynamoDB: " + e.getMessage());
            return;
        }

        System.out.println("\nCurrent Employees in table '" + tableName + "':");
        try {
            dynamoDb.scan(r -> r.tableName(tableName))
                    .items()
                    .forEach(item -> System.out.println(" - " +
                            item.get("ID").n() + " | " +
                            item.get("Name").s() + " | " +
                            item.get("NomenClature").s()));
        } catch (Exception e) {
            System.out.println("Unable to scan table: " + e.getMessage());
        }

        int choice;
        while (true) {
            System.out.println("\nUpdate Options:");
            System.out.println("1. Single Attribute");
            System.out.println("2. Multiple Attributes");
            System.out.println("3. Conditional Update");
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
                if (choice < 1 || choice > 3) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Enter 1, 2, or 3.");
            }
        }

        Map<String, String> exprAttrNames = new HashMap<>();
        Map<String, AttributeValue> exprAttrValues = new HashMap<>();
        StringBuilder updateExpr = new StringBuilder("SET ");

        try {
            switch (choice) {

                case 1 -> {
                    int fieldChoice;
                    while (true) {
                        System.out.println("Choose field to update:");
                        System.out.println("1. Name");
                        System.out.println("2. NomenClature");
                        System.out.print("Enter choice: ");
                        try {
                            fieldChoice = Integer.parseInt(sc.nextLine().trim());
                            if (fieldChoice < 1 || fieldChoice > 2) throw new NumberFormatException();
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid choice. Enter 1 or 2.");
                        }
                    }

                    String fieldName = (fieldChoice == 1) ? "Name" : "NomenClature";

                    System.out.print("Enter new value for " + fieldName + ": ");
                    String newValue = sc.nextLine().trim();
                    if (newValue.isEmpty()) {
                        System.out.println("No value entered. Aborting update.");
                        return;
                    }

                    exprAttrNames.put("#field", fieldName);
                    exprAttrValues.put(":val", AttributeValue.builder().s(newValue).build());
                    updateExpr.append("#field = :val");
                }

                case 2 -> {
                    System.out.print("Enter new Name (leave blank to skip): ");
                    String newName = sc.nextLine().trim();
                    System.out.print("Enter new NomenClature (leave blank to skip): ");
                    String newRole = sc.nextLine().trim();

                    boolean first = true;
                    if (!newName.isEmpty()) {
                        exprAttrNames.put("#name", "Name");
                        exprAttrValues.put(":nameVal", AttributeValue.builder().s(newName).build());
                        updateExpr.append("#name = :nameVal");
                        first = false;
                    }
                    if (!newRole.isEmpty()) {
                        if (!first) updateExpr.append(", ");
                        exprAttrNames.put("#role", "NomenClature");
                        exprAttrValues.put(":roleVal", AttributeValue.builder().s(newRole).build());
                        updateExpr.append("#role = :roleVal");
                    }

                    if (exprAttrValues.isEmpty()) {
                        System.out.println("No values provided. Aborting update.");
                        return;
                    }
                }

                case 3 -> {
                    int condChoice;
                    while (true) {
                        System.out.println("Choose field to update conditionally:");
                        System.out.println("1. Name");
                        System.out.println("2. NomenClature");
                        System.out.print("Enter choice: ");
                        try {
                            condChoice = Integer.parseInt(sc.nextLine().trim());
                            if (condChoice < 1 || condChoice > 2) throw new NumberFormatException();
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid choice. Enter 1 or 2.");
                        }
                    }

                    String condField = (condChoice == 1) ? "Name" : "NomenClature";

                    System.out.print("Enter new value for " + condField + ": ");
                    String newVal = sc.nextLine().trim();
                    if (newVal.isEmpty()) {
                        System.out.println("No value entered. Aborting update.");
                        return;
                    }

                    System.out.print("Enter expected current value for conditional update: ");
                    String expectedVal = sc.nextLine().trim();
                    if (expectedVal.isEmpty()) {
                        System.out.println("No expected value entered. Aborting update.");
                        return;
                    }

                    exprAttrNames.put("#field", condField);
                    exprAttrValues.put(":val", AttributeValue.builder().s(newVal).build());
                    exprAttrValues.put(":expected", AttributeValue.builder().s(expectedVal).build());
                    updateExpr.append("#field = :val");

                    UpdateItemRequest updateReq = UpdateItemRequest.builder()
                            .tableName(tableName)
                            .key(key)
                            .updateExpression(updateExpr.toString())
                            .conditionExpression("#field = :expected")
                            .expressionAttributeNames(exprAttrNames)
                            .expressionAttributeValues(exprAttrValues)
                            .returnValues(ReturnValue.ALL_NEW)
                            .build();

                    try {
                        UpdateItemResponse resp = dynamoDb.updateItem(updateReq);
                        System.out.println("Conditional update succeeded! New values:");
                        resp.attributes().forEach((k, v) ->
                                System.out.println(" - " + k + ": " + (v.s() != null ? v.s() : v.n())));
                    } catch (ConditionalCheckFailedException e) {
                        System.out.println("Conditional update failed: Expected value did not match.");
                    } catch (Exception e) {
                        System.out.println("Conditional update failed: " + e.getMessage());
                    }
                    return;
                }
            }

            UpdateItemRequest updateRequest = UpdateItemRequest.builder()
                    .tableName(tableName)
                    .key(key)
                    .updateExpression(updateExpr.toString())
                    .expressionAttributeNames(exprAttrNames)
                    .expressionAttributeValues(exprAttrValues)
                    .returnValues(ReturnValue.ALL_NEW)
                    .build();

            UpdateItemResponse response = dynamoDb.updateItem(updateRequest);
            System.out.println("Employee updated successfully! New details:");
            response.attributes().forEach((k, v) ->
                    System.out.println(" - " + k + ": " + (v.s() != null ? v.s() : v.n()))
            );

        } catch (DynamoDbException e) {
            System.out.println("Error updating employee: " + e.getMessage());
        }
    }
}
