public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

     //   boolean swpd = false;

        for (int i = 0; i < arr.length - 1; i++) {
           // swpd = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                   // swpd = true;
                }
            }
         //   if (!swpd) { break; }
        }


        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
