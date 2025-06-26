import java.util.LinkedList;

public class RemoveElementFromLinkedList {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // Step 2: Add 5 elements
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");

        // Step 3: Print original list
        System.out.println("Original LinkedList: " + cities);

        // Step 4: Remove a specific element, e.g., "Tokyo"
        cities.remove("Tokyo");

        // Step 5: Print updated list
        System.out.println("Updated LinkedList after removing 'Tokyo': " + cities);
    }
}
