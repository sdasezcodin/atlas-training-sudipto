package com.dynamodb.employee;

import com.dynamodb.connection.DDBConnection;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateEmployee {

    public static void addEmployee(String tableName) {
        if (tableName == null || tableName.isEmpty()) {
            System.out.println("No table selected! Please create or select a table first.");
            return;
        }

        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Employee ID: ");
        String idInput = sc.nextLine().trim();
        Map<String, AttributeValue> key = new HashMap<>();
        key.put("ID", AttributeValue.builder().n(idInput).build());

        boolean exists = dynamoDb.getItem(GetItemRequest.builder()
                        .tableName(tableName)
                        .key(key)
                        .build())
                .hasItem();

        if (exists) {
            System.out.println("Error: Employee with ID " + idInput + " already exists in table '" + tableName + "'.");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter NomenClature: ");
        String nomen = sc.nextLine();

        Map<String, AttributeValue> item = new HashMap<>();
        item.put("ID", AttributeValue.builder().n(idInput).build());
        item.put("Name", AttributeValue.builder().s(name).build());
        item.put("NomenClature", AttributeValue.builder().s(nomen).build());

        PutItemRequest putReq = PutItemRequest.builder()
                .tableName(tableName)
                .item(item)
                .build();

        dynamoDb.putItem(putReq);

        System.out.println("\nEmployee added successfully to table '" + tableName + "':");
        System.out.println(idInput + " | " + name + " | " + nomen);
    }
}
