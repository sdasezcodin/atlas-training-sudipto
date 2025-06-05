class NameLengthHelper {
    // Returns the length of the name (char array)
    public static int calculateNameLength(char[] name) {
        return name.length;
    }

    // Returns the name as a String
    public static String getNameAsString(char[] name) {
        return String.valueOf(name);
    }

    // Prints each character of the name using a for loop
    public static void printEachCharacter(char[] name) {
        System.out.println("Characters in the name:");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Character " + (i + 1) + ": " + name[i]);
        }
    }
}

public class Task020 {
    public static void main(String[] args) {
        char[] name = {'s', 'u', 'd', 'i', 'p', 't', 'o'};

        // Get name as String and its length
        String nameStr = NameLengthHelper.getNameAsString(name);
        int length = NameLengthHelper.calculateNameLength(name);

        // Print the name and its length
        System.out.println("The name is: " + nameStr);
        System.out.println("Length of the name: " + length);

        // Print each character using the new helper method
        NameLengthHelper.printEachCharacter(name);
    }
}