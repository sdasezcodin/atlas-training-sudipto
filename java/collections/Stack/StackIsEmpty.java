import java.util.Stack;

class StackIsEmpty {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        // Task 8: Check whether the stack is empty and print the result.
        if (names.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }
}
