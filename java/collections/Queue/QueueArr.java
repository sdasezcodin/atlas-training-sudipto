public class QueueArr {
    public static void main(String[] args) {
        Que q = new Que(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Peek: " + q.peek());

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Is Empty? " + q.isEmpty());
        System.out.println("Is Full? " + q.isFull());
    }
}

class Que {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    public Que(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    // Enqueue operation (add to rear)
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue operation (remove from front)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}


