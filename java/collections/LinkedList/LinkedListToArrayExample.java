import java.util.LinkedList;

public class LinkedListToArrayExample {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // Step 2: Add elements to the list
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Lion");
        animals.add("Tiger");

        // Step 3: Convert LinkedList to Array
        String[] animalArray = animals.toArray(new String[0]);

        // Step 4: Print the array
        System.out.println("Array contents:");
        for (String animal : animalArray) {
            System.out.println(animal);
        }
    }
}
