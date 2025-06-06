public class Task036 {
    public static void main(String[] args) {
        // Creating object of InfoPrinter class
        InfoPrinter printer = new InfoPrinter();

        // Calling overloaded methods with different parameter sequences
        printer.printInfo("Alice", 25);          // String, int
        printer.printInfo(101, "HR");            // int, String
        printer.printInfo(true, "Active");       // boolean, String
    }
}

class InfoPrinter {

    // Method with String first, then int
    void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method with int first, then String
    void printInfo(int code, String department) {
        System.out.println("Code: " + code + ", Department: " + department);
    }

    // Method with boolean first, then String
    void printInfo(boolean status, String message) {
        System.out.println("Status: " + status + ", Message: " + message);
    }
}

