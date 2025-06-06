public class Task027 {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60 };

        // Passing array to calculateSum method
        calculateSum(numbers);
    }

    // Method to calculate and print sum of array elements
    public static void calculateSum(int[] array) {
        int total = 0;

        for (int num : array) {
            total += num;
        }

        System.out.println("Sum of array elements: " + total);
    }
}