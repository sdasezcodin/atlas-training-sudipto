import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWithStreamAPI {

    public static void main(String[] args) {

        // Step 1: Create a list with duplicate values
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,10,30,20,40));

        System.out.println("Original List with Duplicates:");
        System.out.println(numbers);

        // Step 2: Remove duplicates using stream and collect
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()  // removes duplicates
                .collect(Collectors.toList());

        // Step 3: Display the result
        System.out.println("List after Removing Duplicates:");
        System.out.println(uniqueNumbers);
    }
}


