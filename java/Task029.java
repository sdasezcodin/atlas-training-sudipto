public class Task029 {
    public static void main(String[] args) {
        // Original array with different values
        int[] originalArray = { 10, 20, 30, 40, 50 };

        // Clone the array
        int[] clonedArray = originalArray.clone();

        // Compare references (should be false - different objects)
        System.out.println("Are references equal? " + (originalArray == clonedArray));

        // Print cloned array contents
        System.out.println("Cloned array elements:");
        for (int num : clonedArray) {
            System.out.print(num + " ");
        }

        // Demonstrate they're independent
        clonedArray[0] = 100;
        System.out.println("\nAfter modification:");
        System.out.println("Original[0]: " + originalArray[0]);
        System.out.println("Cloned[0]: " + clonedArray[0]);
    }
}