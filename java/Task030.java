import java.util.Arrays;

public class Task030 {
    public static void main(String[] args) {
        // Original 2D array
        int[][] originalMatrix = {{10, 20, 30}, {40, 50, 60}, {70}};

        // 1. Shallow copy (using clone())
        int[][] shallowCopy = originalMatrix.clone();

        // 2. Deep copy (manual implementation)
        int[][] deepCopy = new int[originalMatrix.length][];
        for (int i = 0; i < originalMatrix.length; i++) {
            deepCopy[i] = originalMatrix[i].clone();
        }

        System.out.println("===== REFERENCE COMPARISON =====");
        System.out.println("Shallow copy main array reference: " + (originalMatrix == shallowCopy)); // false
        System.out.println("Shallow copy first row reference: " + (originalMatrix[0] == shallowCopy[0])); // true
        System.out.println("Deep copy main array reference: " + (originalMatrix == deepCopy)); // false
        System.out.println("Deep copy first row reference: " + (originalMatrix[0] == deepCopy[0])); // false

        System.out.println("\n===== MODIFICATION TEST =====");
        // Modify through shallow copy (affects original)
        shallowCopy[0][0] = 100;
        // Modify through deep copy (doesn't affect original)
        deepCopy[1][0] = 500;

        System.out.println("Original[0][0]: " + originalMatrix[0][0] + " (changed by shallow copy)");
        System.out.println("Original[1][0]: " + originalMatrix[1][0] + " (unchanged by deep copy)");
        System.out.println("ShallowCopy[0][0]: " + shallowCopy[0][0]);
        System.out.println("DeepCopy[1][0]: " + deepCopy[1][0]);

        System.out.println("\n===== ARRAY CONTENTS =====");
        System.out.println("Original: " + Arrays.deepToString(originalMatrix));
        System.out.println("Shallow: " + Arrays.deepToString(shallowCopy));
        System.out.println("Deep: " + Arrays.deepToString(deepCopy));
    }
}
