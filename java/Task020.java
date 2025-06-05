class NameLengthHelper {
    // Calculate length directly from the char[]
    public static int calculateNameLength(char[] name) {
        return name.length; // No conversion needed
    }

    // Print each character from the char[] (no String conversion)
    public static void printEachCharacter(char[] name) {
        System.out.println("\nBreaking down the name:");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Character " + (i + 1) + ": '" + name[i] + "'");
        }
    }
}

public class Task020 {
    public static void main(String[] args) {
        char[] name = {'s', 'u', 'd', 'i', 'p', 't', 'o'};

        // Get length and print details
        System.out.println("Full name: " + new String(name)); // Print as String once
        System.out.println("Length: " + NameLengthHelper.calculateNameLength(name));

        // Print characters directly from the array
        NameLengthHelper.printEachCharacter(name);
    }
}