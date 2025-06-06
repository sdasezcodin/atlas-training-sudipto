public class Task034 {
    public static void main(String[] args) {
        // Creating object of NumberPrinter class
        NumberPrinter printer = new NumberPrinter();

        // Calling overloaded methods
        printer.printNumbers(10);           // Single number
        printer.printNumbers(10, 20);       // Two numbers
        printer.printNumbers(10, 20, 30);   // Three numbers
    }
}

// Class to demonstrate method overloading
class NumberPrinter {

    // Method with 1 parameter
    void printNumbers(int a) {
        System.out.println("Single number: " + a);
    }

    // Method with 2 parameters
    void printNumbers(int a, int b) {
        System.out.println("Two numbers: " + a + " and " + b);
    }

    // Method with 3 parameters
    void printNumbers(int a, int b, int c) {
        System.out.println("Three numbers: " + a + ", " + b + ", " + c);
    }
}

