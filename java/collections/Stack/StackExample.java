import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        // Creating a Stack of Strings
        Stack<String> names = new Stack<>();

        // Push elements onto the stack
        names.push("Prasunamba");
        names.push("Meher");
        names.push(".MK");

        // Print the current stack
        System.out.println("Stack after push operations: " + names);

        // Peek at the top element
        System.out.println("Top of the stack (peek): " + names.peek());

        // Pop the top element
        String poppedElement = names.pop();
        System.out.println("Popped element: " + poppedElement);

        // Stack after pop
        System.out.println("Stack after pop operation: " + names);

        // Check if stack is empty
        System.out.println("Is the stack empty? " + names.isEmpty());

        // Search for an element in the stack
        int position = names.search("Prasunamba");
        if (position != -1) {
            System.out.println("\"Prasunamba\" found at position (from top): " + position);
        } else {
            System.out.println("\"Prasunamba\" not found in the stack.");
        }
    }
}



