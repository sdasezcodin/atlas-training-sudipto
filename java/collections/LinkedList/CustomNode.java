class Node {
    int data;       // value stored in node
    Node next;      // reference to next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomNode {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        System.out.print("Linked List elements: ");
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
