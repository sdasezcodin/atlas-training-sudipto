public class Task035 {
    public static void main(String[] args) {
        // Creating object of ValuePrinter class
        ValuePrinter printer = new ValuePrinter();

        // Calling overloaded methods with different types
        printer.printValue(10);         // Integer version
        printer.printValue(10.5);       // Double version
        printer.printValue("Hello");    // String version
    }
}

class ValuePrinter {

    // Method to handle integer input
    void printValue(int num) {
        System.out.println("Integer number: " + num);
    }

    // Method to handle double input
    void printValue(double num) {
        System.out.println("Double number: " + num);
    }

    // Method to handle string input
    void printValue(String text) {
        System.out.println("String value: " + text);
    }
}

