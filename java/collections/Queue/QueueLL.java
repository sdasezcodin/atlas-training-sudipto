public class QueueLL {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); // Queue: 10 20 30

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Peek: " + queue.peek());         // 20

        queue.display(); // Queue: 20 30
    }
}

class Node11 {
    int data;
    Node11 next;

    Node11(int value) {
        data = value;
        next = null;
    }
}

class MyQueue {
    private Node11 front, rear;

    public MyQueue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node11 newNode = new Node11(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node11 temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
