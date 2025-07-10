public class RecursiveElementSearch {
    public static boolean search(int[] arr, int index, int target) {
        if (index >= arr.length) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        }

        return search(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;

        boolean found = search(array, 0, target);
        if (found) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found.");
        }
    }
}


