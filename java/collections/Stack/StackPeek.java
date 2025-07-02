import java.util.Stack;

class StackPeek {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Prasunamba");
        names.push("Meher");
        names.push("Sudipta");

        String topElement = names.peek();

        System.out.println("Top element (peeked): " + topElement);
    }
}
