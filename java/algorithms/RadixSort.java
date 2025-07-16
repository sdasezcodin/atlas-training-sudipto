import java.util.Arrays;
public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(arr, place);
        }
    }
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }
    private static void countingSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // Digits 0 to 9
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
