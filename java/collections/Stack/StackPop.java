import java.util.Stack;

class StackPop {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Prasunamba");
        names.push("Meher");
        names.push(".MK");

        System.out.println("Before deletion:");
        System.out.println("Stack of names: " + names);

        String poppedName = names.pop();

        System.out.println("After deletion:");
        System.out.println("Stack of names: " + names);

        System.out.println("Deleted (popped) element is: " + poppedName);
    }
}
