import java.util.ArrayList;
import java.util.List;

public class StreamGroupingFiltering {

    // Static list to hold places
    static List<String> places = new ArrayList<>();

    // Method to initialize and return list of places
    public static List<String> loadPlaces() {
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {

        List<String> myPlaces = loadPlaces();

        System.out.println("Places from Nepal (sorted & uppercased):");

        // Stream pipeline to filter, transform, sort, and print
        myPlaces.stream()
                .filter(p -> p.startsWith("Nepal"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
