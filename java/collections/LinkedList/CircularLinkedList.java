class Node1 {
    int value;
    Node1 nextNode;

    public Node1(int value) {
        this.value = value;
    }
}

public class CircularLinkedList {
    private Node1 head = null;
    private Node1 tail = null;

    public void addNode(int value) {
        Node1 newNode = new Node1(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }
        tail = newNode;
        tail.nextNode = head;  // Make it circular
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node1 current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.value + " ");
            current = current.nextNode;
        } while (current != head);
        System.out.println();
    }

    public boolean containsNode(int searchValue) {
        if (head == null) return false;

        Node1 current = head;
        do {
            if (current.value == searchValue) {
                return true;
            }
            current = current.nextNode;
        } while (current != head);

        return false;
    }

    public void deleteNode(int valueToDelete) {
        if (head == null) return;

        Node1 current = head;

        do {
            Node1 next = current.nextNode;

            if (next.value == valueToDelete) {
                if (head == tail) {  // Only one node
                    head = null;
                    tail = null;
                } else {
                    current.nextNode = next.nextNode;
                    if (next == head) head = head.nextNode;
                    if (next == tail) tail = current;
                }
                return;  // Node deleted, exit
            }

            current = next;
        } while (current != head);
    }

    public static CircularLinkedList createCircularLinkedList() {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addNode(13);
        cll.addNode(7);
        cll.addNode(24);
        cll.addNode(1);
        cll.addNode(8);
        cll.addNode(37);
        cll.addNode(46);

        return cll;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = CircularLinkedList.createCircularLinkedList();
        cll.traverse();

        System.out.println("Contains 24? " + cll.containsNode(24));
        System.out.println("Contains 99? " + cll.containsNode(99));

        System.out.println("Deleting node with value 1");
        cll.deleteNode(1);
        cll.traverse();

        System.out.println("Deleting head (13)");
        cll.deleteNode(13);
        cll.traverse();

        System.out.println("Deleting tail (46)");
        cll.deleteNode(46);
        cll.traverse();
    }
}
