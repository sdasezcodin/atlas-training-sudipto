import java.util.Stack;

public class NameStackDemo {
    public static void main(String[] args) {

        Stack<String> nameStack = new Stack<>();

        nameStack.push("Prasunamba");
        nameStack.push("Meher");
        nameStack.push(".MK");


        System.out.println("Initial stack of names: " + nameStack);


        String topName = nameStack.peek();
        System.out.println("Top of the stack (peek): " + topName);


        String removedName = nameStack.pop();
        System.out.println("Popped name: " + removedName);


        System.out.println("Stack after popping: " + nameStack);

        String searchName = "Meher";
        int positionFromTop = nameStack.search(searchName);

        if (positionFromTop != -1) {
            System.out.println("\"" + searchName + "\" is at position (from top): " + positionFromTop);
        } else {
            System.out.println("\"" + searchName + "\" not found in the stack.");
        }

        boolean isEmpty = nameStack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
