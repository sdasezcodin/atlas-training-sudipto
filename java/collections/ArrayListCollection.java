import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        for (int ele : arr) {
            System.out.println("element: " + ele);
        }
    }
}
