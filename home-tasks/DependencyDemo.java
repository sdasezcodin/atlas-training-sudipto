class Printer {
    void printDocument(String doc) {
        System.out.println("Printing: " + doc);
    }
}

class User {
    // User depends on Printer for printing documents
    void createAndPrintDoc() {
        Printer printer = new Printer();  // temporary dependency
        printer.printDocument("UML Concepts Notes");
    }
}

public class DependencyDemo {
    public static void main(String[] args) {
        User user = new User();
        user.createAndPrintDoc();
    }
}
