import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersWithStreamAPI {

    public static void main(String[] args) {

        // Create an ArrayList and add some numbers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,15,22,31,45));

        System.out.println("Odd Numbers:");

        // Use stream to filter odd numbers and print them
        numbers.stream()
                .filter(n -> n % 2 != 0)  // keep only odd numbers
                .forEach(System.out::println); // print them
    }
}


