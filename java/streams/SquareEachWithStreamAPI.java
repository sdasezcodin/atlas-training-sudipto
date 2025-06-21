import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareEachWithStreamAPI {

    public static void main(String[] args) {

        // Create a list to store 5 integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        System.out.println("Squares of the numbers:");

        // Using Stream API to print square of each number
        numbers.stream()
                .map(n -> n * n)  // compute square
                .forEach(System.out::println); // print result
    }
}


