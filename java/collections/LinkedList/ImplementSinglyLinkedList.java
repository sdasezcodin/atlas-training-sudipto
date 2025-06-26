public class ImplementSinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LL {
        private Node head;
        private int size;

        public LL() {
            head = null;
            size = 0;
        }

        Node createNode(int data) {
            return new Node(data);
        }

        // Add at end
        void add(Node node) {
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
            size++;
        }

        // Add at beginning
        void addFirst(Node node) {
            node.next = head;
            head = node;
            size++;
        }

        // Add at specific index
        void addMid(int index, Node node) {
            checkBoundsForAdd(index);
            if (index == 0) {
                addFirst(node);
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }

        // Get data at index
        int get(int index) {
            checkBounds(index);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        // Check if value exists
        boolean contains(int data) {
            return checkIndex(data) != -1;
        }

        // Return index of data
        int checkIndex(int data) {
            Node current = head;
            int index = 0;

            while (current != null) {
                if (current.data == data) {
                    return index;
                }
                current = current.next;
                index++;
            }
            return -1;
        }

        // Remove first occurrence of data
        void remove(int data) {
            if (head == null) return;

            if (head.data == data) {
                head = head.next;
                size--;
                return;
            }

            Node prev = head;
            Node curr = head.next;
            while (curr != null) {
                if (curr.data == data) {
                    prev.next = curr.next;
                    size--;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
        }

        // Clear entire list
        void clear() {
            head = null;
            size = 0;
        }

        // Return size
        int size() {
            return size;
        }

        // Is list empty?
        boolean isEmpty() {
            return size == 0;
        }

        // Display all elements
        void display() {
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println("null");
        }

        // Bounds checking for get/remove
        void checkBounds(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        // Bounds checking for add
        void checkBoundsForAdd(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index out of bounds for insertion");
            }
        }
    }

    public static void main(String[] args) {
        LL ll = new LL();

        System.out.println("01. Adding elements at end:");
        ll.add(ll.createNode(10));
        ll.add(ll.createNode(20));
        ll.add(ll.createNode(30));
        ll.display(); // Expected: 10 -> 20 -> 30 -> null

        System.out.println("02. Adding element at beginning:");
        ll.addFirst(ll.createNode(5));
        ll.display(); // Expected: 5 -> 10 -> 20 -> 30 -> null

        System.out.println("03. Adding element at index 2:");
        ll.addMid(2, ll.createNode(15));
        ll.display(); // Expected: 5 -> 10 -> 15 -> 20 -> 30 -> null

        System.out.println("04. Get element at index 3:");
        System.out.println("Element at index 3: " + ll.get(3)); // Expected: 20

        System.out.println("05. Check if list contains 15:");
        System.out.println("Contains 15? " + ll.contains(15)); // Expected: true

        System.out.println("06. Check if list contains 99:");
        System.out.println("Contains 99? " + ll.contains(99)); // Expected: false

        System.out.println("07. Remove element 10:");
        ll.remove(10);
        ll.display(); // Expected: 5 -> 15 -> 20 -> 30 -> null

        System.out.println("08. Remove head (5):");
        ll.remove(5);
        ll.display(); // Expected: 15 -> 20 -> 30 -> null

        System.out.println("09. Remove tail (30):");
        ll.remove(30);
        ll.display(); // Expected: 15 -> 20 -> null

        System.out.println("10. Size of the list:");
        System.out.println("Size: " + ll.size()); // Expected: 2

        System.out.println("11. Is list empty?");
        System.out.println("Empty? " + ll.isEmpty()); // Expected: false

        System.out.println("12. Clearing the list:");
        ll.clear();
        ll.display(); // Expected: null

        System.out.println("13. Is list empty after clear?");
        System.out.println("Empty? " + ll.isEmpty()); // Expected: true
    }

}
