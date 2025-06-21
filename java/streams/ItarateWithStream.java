import java.util.stream.Stream;

public class ItarateWithStream {

    public static void main(String[] args) {

        // Step 1: Create a stream of 20 numbers starting from 1
        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1)  // start from 1, increment by 1
                .limit(20);              // limit to 20 values (1 to 20)




        System.out.println(nums);

        System.out.println("First 10 Numbers from the Stream:");

        // Step 2: Print only the first 10 numbers using forEach
        nums.limit(10)
                .forEach(System.out::println);
    }
}


