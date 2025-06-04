import java.util.Scanner;

// Class to handle swapping of two numbers
class SwapNumbers {
    // Method to swap two integers and print before and after values
    void swap(int a, int b) {
        // Display values before swapping
        System.out.println("Before swapping: a = " + a + "  b = " + b);

        // Swapping logic using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display values after swapping
        System.out.println("After swapping: a = " + a + "  b = " + b);
    }
}

public class Task003 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first value
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        // Prompt user for the second value
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        // Create an object of SwapNumbers and perform the swap
        SwapNumbers swapper = new SwapNumbers();
        swapper.swap(a, b);

        // Close the scanner to free resources
        scanner.close();
    }
}
