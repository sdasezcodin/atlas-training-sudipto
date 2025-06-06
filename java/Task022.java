public class Task022 {
    public static void main(String[] args) {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the elements of the array
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;
        arr[3] = 35;
        arr[4] = 45;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index "
                    + i + " : " + arr[i]);
    }
}