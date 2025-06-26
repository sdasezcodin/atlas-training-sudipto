import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListWithListIterator {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Japan");
        countries.add("Australia");

        // Create a ListIterator
        ListIterator<String> iterator = countries.listIterator();

        // Iterate using ListIterator
        System.out.println("Iterating using ListIterator:");
        while (iterator.hasNext()) {
            String country = iterator.next();
            System.out.println(country);
        }
    }
}
