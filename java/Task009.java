import java.util.Scanner;

// Class to find the greatest of 3 numbers.
class GreaterOfThree {
    // Method to compare and print the greatest number
    void findGreatest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("a is the greatest");
        } else if (b >= a && b >= c) {
            System.out.println("b is the greatest");
        } else {
            System.out.println("c is the greatest");
        }
    }
}

public class Task009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();
        System.out.print("Enter number c: ");
        int c = scanner.nextInt();

        // Create object and check the greatest
        GreaterOfThree checker = new GreaterOfThree();
        checker.findGreatest(a, b, c);

        scanner.close();
    }
}
