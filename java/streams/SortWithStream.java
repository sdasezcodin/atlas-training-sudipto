import java.util.ArrayList;
import java.util.List;

public class SortWithStream {

    public static void main(String[] args) {

        // Step 1: Create a list of friend names
        //List<String> names = new ArrayList<>(List.of("Rahul", "Sneha", "Amit", "Priya", "Zara"));
        List<String> names = new ArrayList<>(List.of("a", "A", "b", "bB", "bb"));


        System.out.println("Original Names List:");
        System.out.println(names);

        // Step 2: Sort the names using stream
        List<String> sortedNames = names.stream()
                .sorted()
                .toList();

        // Step 3: Display sorted names
        System.out.println("\nSorted Names List:");
        sortedNames.forEach(System.out::println);
    }
}


