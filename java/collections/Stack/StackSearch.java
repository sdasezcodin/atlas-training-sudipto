import java.util.Stack;

public class StackSearch {
    public static void main(String[] args) {

        Stack<String> names = new Stack<>();

        names.push("Prasunamba");
        names.push("Meher");
        names.push(".MK");

        System.out.println("Stack of names: " + names);

        String searchName = "Meher";

        int position = names.search(searchName);

        if (position != -1) {
            System.out.println("\"" + searchName + "\" is found at position (from top): " + position);
        } else {
            System.out.println("\"" + searchName + "\" is not found in the stack.");
        }
    }
}
