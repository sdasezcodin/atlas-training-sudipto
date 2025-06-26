import java.util.LinkedList;

public class LinkedListPushPopExample {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList
        LinkedList<String> stack = new LinkedList<>();

        // Step 2: Push elements onto the list (LIFO order)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Print after pushing
        System.out.println("Stack after push operations: " + stack); // [Cherry, Banana, Apple]

        // Step 3: Pop the top element
        String popped = stack.pop();

        // Step 4: Print the popped element and the updated stack
        System.out.println("Popped element: " + popped);             // Cherry
        System.out.println("Stack after pop: " + stack);             // [Banana, Apple]
    }
}
