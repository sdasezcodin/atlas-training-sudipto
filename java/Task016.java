package Enumerations;

// Define an enum named 'Color'
enum Color {
    red, blue, green, yellow
}

// Main class to demonstrate enums
public class Task016 {
    public static void main(String[] args) {
        // Assign a value from the enum to a variable.
        Color c1 = Color.yellow;

        // Print the enum value
        System.out.println(c1);  // Output: yellow
    }
}
