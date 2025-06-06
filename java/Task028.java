public class Task028 {
    public static void main(String[] args) {
        // Get array from createNumbers method
        int[] numbers = createNumbers();

        System.out.println("Generated array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Method that returns an array
    public static int[] createNumbers() {
        // Return a new array
        return new int[] { 5, 10, 15, 20 };
    }
}
