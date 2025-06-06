public class Task026 {
    public static void main(String[] args) {
        // declaring and initializing 3x3 array
        int[][] matrix = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        // printing 2D array using loop
        System.out.println("3x3 Matrix Elements:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}