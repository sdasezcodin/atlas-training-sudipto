package StringHandling;

// Separate class to demonstrate string handling
class StringDemo {
    // Method to demonstrate various ways to create and print strings
    void showStrings() {
        // String literal
        String str1 = "Java Strings";

        // Creating string using 'new' keyword from another string
        String str2 = new String(str1);

        // Creating string directly using 'new' keyword with text
        String str3 = new String("are easy to learn");

        // Creating string from a character array
        char ch[] = {'S', 't', 'r', 'i', 'n', 'g'};
        String str4 = new String(ch);

        // Printing all strings
        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4);
    }
}

public class Task015 {
    public static void main(String[] args) {
        // Create object of StringDemo class
        StringDemo demo = new StringDemo();

        // Call method to show string examples
        demo.showStrings();
    }
}
