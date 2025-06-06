package Arrays;

class ArrayDemo {
    // Method to print char array.
    void printCharArray(char[] arr) {
        System.out.println(arr);  // prints as string, e.g. "aeiou"
    }

    // Method to demonstrate String array operations
    void stringArrayOperations() {
        // Initialize String array
        String[] names = {"Meena", "Tina", "Veena", "heena"};

        // Print first element
        System.out.println(names[0]);  // Output: Meena

        // Modify second element
        names[1] = "Reena";
        System.out.println(names[1]);  // Output: Reena

        // Print length of the array
        System.out.println(names.length);  // Output: 4

        // Try accessing 5th index (index 4)
        int indexToAccess = 4;
        if (indexToAccess >= 0 && indexToAccess < names.length) {
            System.out.println(names[indexToAccess]);
        } else {
            System.out.println("Index " + indexToAccess + " is out of bounds.");
        }

        // Try accessing negative index (-1)
        int negativeIndex = -1;
        if (negativeIndex >= 0 && negativeIndex < names.length) {
            System.out.println(names[negativeIndex]);
        } else {
            System.out.println("Index " + negativeIndex + " is invalid.");
        }
    }
}

public class Task014 {
    public static void main(String[] args) {
        // Create object of ArrayDemo class
        ArrayDemo demo = new ArrayDemo();

        // Char array with vowels
        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        // Call method to print char array
        demo.printCharArray(arr);

        // Call method to perform String array operations
        demo.stringArrayOperations();
    }
}
