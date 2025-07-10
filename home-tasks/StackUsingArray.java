public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Indicates the stack is initially empty
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1; // or throw exception
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
    }
}
