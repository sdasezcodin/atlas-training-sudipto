public class RecursiveArrayCopy {

    public static void copyArray(int[] source, int[] destination, int index) {
        if (index >= source.length) {
            return;
        }
        destination[index] = source[index];
        copyArray(source, destination, index + 1);
    }

    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[source.length];

        copyArray(source, destination, 0);

        System.out.print("Copied array: ");
        for (int val : destination) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
