import java.util.Scanner;

// Class to compare two numbers using if-else.
class NumberComparison {
    // Method to compare two numbers and print which one is greater
    void checkGreater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("num1 is greater");
        } else if (num1 < num2) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}

public class Task008 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter first number (num1): ");
        int num1 = scanner.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter second number (num2): ");
        int num2 = scanner.nextInt();

        // Create object of NumberComparison class
        NumberComparison checker = new NumberComparison();

        // Call the method to compare the numbers
        checker.checkGreater(num1, num2);

        // Close the scanner
        scanner.close();
    }
}
