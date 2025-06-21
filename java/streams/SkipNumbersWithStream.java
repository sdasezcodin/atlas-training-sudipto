import java.util.stream.Stream;

public class SkipNumbersWithStream {
    public static void main(String[] args) {

        // Create a stream of integers starting from 1, incrementing by 1, limit to 20 numbers
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);

        // Skip the first 15 numbers
        Stream<Integer> skipNums = nums.skip(15);

        // Print remaining numbers using forEach
        skipNums.forEach(System.out::println);
    }
}



