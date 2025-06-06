import java.util.Scanner;

// Class to perform addition of two numbers.
class AddTwoNumber {
    // Method to add two integers and return the sum
    int add(int a, int b) {
        return a + b;
    }
}

public class Task002 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Create AddTwoNumber object to use add method
        AddTwoNumber addTwoNumber = new AddTwoNumber();

        // Prompt user to enter first integer value
        System.out.print("Enter First Value: ");
        int num1 = scanner.nextInt();

        // Prompt user to enter second integer value
        System.out.print("Enter Second Value: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of two numbers
        int sum = addTwoNumber.add(num1, num2);

        // Display the result to the user
        System.out.println("Output: " + sum);

        // Close the scanner object to free resources
        scanner.close();
    }
}
