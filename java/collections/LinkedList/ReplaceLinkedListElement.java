import java.util.LinkedList;

public class ReplaceLinkedListElement {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Step 2: Add 5 elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");

        // Step 3: Print original list
        System.out.println("Original LinkedList: " + fruits);

        // Step 4: Replace 3rd element (index 2) with "Cherry"
        fruits.set(2, "Cherry");

        // Step 5: Print updated list
        System.out.println("Updated LinkedList: " + fruits);
    }
}
