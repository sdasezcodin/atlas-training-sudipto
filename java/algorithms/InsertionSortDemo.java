public class InsertionSortDemo {

    public static void main(String[] args) {

        int[] arr = {29, 10, 14, 37, 13};

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
