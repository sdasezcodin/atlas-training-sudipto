package com.dynamodb;

import com.dynamodb.connection.DDBConnection;
import com.dynamodb.employee.*;
import com.dynamodb.table.AddTable;
import com.dynamodb.table.DeleteTable;
import com.dynamodb.table.SelectTable;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

import java.util.Scanner;

public class EmployeeManagerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DynamoDbClient dynamoDb = DDBConnection.getConnection();
        boolean running = true;
        String currentTable = null;

        while (running) {
            try {
                // -------- Table Management -------
                System.out.println("\n==============================");
                System.out.println("   Employee DynamoDB Manager   ");
                System.out.println("==============================");
                System.out.println("0. Exit");
                System.out.println("1. Add Table");
                System.out.println("2. Select Table");
                System.out.println("3. Delete Table");
                System.out.print("\nSelect an option (0-3): ");

                int tableChoice;
                try {
                    tableChoice = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 0 and 3.");
                    continue;
                }

                switch (tableChoice) {
                    case 0 -> running = false;
                    case 1 -> {
                        try {
                            currentTable = AddTable.createTableWithUserInput();
                        } catch (Exception e) {
                            System.out.println("Failed to create table: " + e.getMessage());
                        }
                    }
                    case 2 -> {
                        try {
                            currentTable = SelectTable.selectTable();
                        } catch (Exception e) {
                            System.out.println("Failed to select table: " + e.getMessage());
                        }
                    }
                    case 3 -> {
                        try {
                            DeleteTable.deleteTable();
                            if (currentTable != null) currentTable = null;
                        } catch (Exception e) {
                            System.out.println("Failed to delete table: " + e.getMessage());
                        }
                    }
                    default -> {
                        System.out.println("Invalid option. Enter 0-3.");
                        continue;
                    }
                }

                // -------- Employee Management --------
                while (currentTable != null) {
                    System.out.println("\n--- Employee Manager Menu (Table: " + currentTable + ") ---");
                    System.out.println("0. Back to Table Menu");
                    System.out.println("1. Insert from JSON");
                    System.out.println("2. Add Employee Manually");
                    System.out.println("3. Delete Employee");
                    System.out.println("4. Search Employee");
                    System.out.println("5. Update Employee");
                    System.out.print("\nSelect an option (0-5): ");

                    int empChoice;
                    try {
                        empChoice = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Enter a number between 0 and 5.");
                        continue;
                    }

                    switch (empChoice) {
                        case 0 -> currentTable = null;
                        case 1 -> {
                            try {
                                InsertWithJson.insertEmployeesFromJSON(currentTable);
                            } catch (Exception e) {
                                System.out.println("Failed to insert from JSON: " + e.getMessage());
                            }
                        }
                        case 2 -> {
                            try {
                                CreateEmployee.addEmployee(currentTable);
                            } catch (Exception e) {
                                System.out.println("Failed to add employee: " + e.getMessage());
                            }
                        }
                        case 3 -> {
                            try {
                                DeleteEmployee.deleteEmployeeById(currentTable);
                            } catch (Exception e) {
                                System.out.println("Failed to delete employee: " + e.getMessage());
                            }
                        }
                        case 4 -> {
                            try {
                                ReadEmployee.showTableAndSearch(currentTable);
                            } catch (Exception e) {
                                System.out.println("Failed to search employees: " + e.getMessage());
                            }
                        }
                        case 5 -> {
                            try {
                                UpdateEmployee.updateEmployee(currentTable);
                            } catch (Exception e) {
                                System.out.println("Failed to update employee: " + e.getMessage());
                            }
                        }
                        default -> System.out.println("Invalid option. Enter 0-5.");
                    }
                }

            } catch (Exception e) {
                System.out.println("Unexpected error occurred: " + e.getMessage());
            }
        }

        sc.close();
        try {
            DDBConnection.closeConnection();
        } catch (Exception e) {
            System.out.println("Failed to close DynamoDB connection: " + e.getMessage());
        }

        System.out.println("Exiting Employee Manager. Goodbye!");
    }
}
