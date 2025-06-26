import java.util.LinkedList;

public class CloneLinkedListExample {
    public static void main(String[] args) {
        // Step 1: Create the first LinkedList
        LinkedList<String> originalList = new LinkedList<>();

        // Step 2: Add elements
        originalList.add("One");
        originalList.add("Two");
        originalList.add("Three");
        originalList.add("Four");

        // Step 3: Clone the list
        LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();

        // Step 4: Print both lists
        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Cloned LinkedList:   " + clonedList);

    }
}
