import java.util.Scanner;

// Class to perform basic arithmetic operations
class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers (checks for division by zero)
    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

public class Task004 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create Calculator object to perform operations
        Calculator calculator = new Calculator();

        // Prompt user for first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Prompt user for second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Indicate start of main processing
        System.out.println("Main started");

        // Perform and display all arithmetic operations
        System.out.println("Sum of 2 numbers is " + calculator.add(num1, num2));
        System.out.println("Difference of 2 numbers is " + calculator.subtract(num1, num2));
        System.out.println("Product of 2 numbers is " + calculator.multiply(num1, num2));
        System.out.println("Division of 2 numbers is " + calculator.divide(num1, num2));

        // Indicate end of main processing
        System.out.println("Main ended");

        // Close the scanner
        scanner.close();
    }
}
