public class Task025 {
    public static void main(String[] args) {
        // Create and initialize an array.
        int[] numbers = new int[6];
        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 25;
        numbers[3] = 35;
        numbers[4] = 45;
        numbers[5] = 55;

        // Print array contents
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // array bounds checking
        try {
            System.out.println("\nTrying to access element outside the array bounds:");
            System.out.println(numbers[8]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Maximum valid index is " + (numbers.length - 1));
        }
    }
}

