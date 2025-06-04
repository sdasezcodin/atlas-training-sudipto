import java.util.Scanner;

// Class to compare two numbers
class CompareNumbers {
    // Method to compare two integers using a ternary operator
    String compare(int a, int b) {
        return (a > b) ? "a is greater than b" : "a is not greater than b";
    }
}

public class Task005 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Create CompareNumbers object to perform comparison
        CompareNumbers comparer = new CompareNumbers();

        // Prompt user for value of a
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        // Prompt user for value of b
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        // Get result using ternary comparison
        String result = comparer.compare(a, b);

        // Display the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
