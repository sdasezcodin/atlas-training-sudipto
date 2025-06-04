// Class to print numbers from 10 to 1, skipping 7 and 5
class NumberPrinter {
    // Method to print numbers with specified conditions
    void printNumbers() {
        // Loop from 10 down to 1
        for (int i = 10; i > 0; i--) {
            // Skip 7 and 5
            if (i == 7 || i == 5) {
                continue; // Skip printing this number
            }
            // Print the current number
            System.out.println(i);
        }
    }
}

public class Task013 {
    public static void main(String[] args) {
        // Create NumberPrinter object
        NumberPrinter printer = new NumberPrinter();
        // Call method to print numbers
        printer.printNumbers();
    }
}
