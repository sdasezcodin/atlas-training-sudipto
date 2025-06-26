public class ImplementDoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class DLL {
        private Node head;
        private Node tail; // ✅ tail added
        private int size;

        public DLL() {
            head = null;
            tail = null;
            size = 0;
        }

        Node createNode(int data) {
            return new Node(data);
        }

        void add(Node node) {
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
            size++;
        }

        void addFirst(Node node) {
            if (head != null) {
                node.next = head;
                head.prev = node;
            } else {
                tail = node;
            }
            head = node;
            size++;
        }

        void addMid(int index, Node node) {
            checkBoundsForAdd(index);
            if (index == 0) {
                addFirst(node);
                return;
            } else if (index == size) {
                add(node);
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
            size++;
        }

        int get(int index) {
            checkBounds(index);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        boolean contains(int data) {
            return checkIndex(data) != -1;
        }

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

        void remove(int data) {
            if (head == null) return;

            if (head.data == data) {
                head = head.next;
                if (head != null) head.prev = null;
                else tail = null;
                size--;
                return;
            }

            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    if (current.prev != null) current.prev.next = current.next;
                    if (current.next != null) current.next.prev = current.prev;
                    else tail = current.prev;
                    size--;
                    return;
                }
                current = current.next;
            }
        }

        void clear() {
            head = null;
            tail = null;
            size = 0;
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void display() {
            Node node = head;
            while (node != null) {
                System.out.print(node.data + " <-> ");
                node = node.next;
            }
            System.out.println("null");
        }

        void displayReverse() {
            Node node = tail;
            while (node != null) {
                System.out.print(node.data + " <-> ");
                node = node.prev;
            }
            System.out.println("null");
        }

        void checkBounds(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        void checkBoundsForAdd(int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index out of bounds for insertion");
            }
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();

        System.out.println("0. Adding elements at end:");
        dll.add(dll.createNode(10));
        dll.add(dll.createNode(20));
        dll.add(dll.createNode(30));
        dll.display(); // Expected: 10 <-> 20 <-> 30 <-> null
        dll.displayReverse(); // Reverse: 30 <-> 20 <-> 10 <-> null

        System.out.println("1. Adding element at beginning:");
        dll.addFirst(dll.createNode(5));
        dll.display(); // Expected: 5 <-> 10 <-> 20 <-> 30 <-> null
        dll.displayReverse();

        System.out.println("2. Adding element at index 2:");
        dll.addMid(2, dll.createNode(15));
        dll.display(); // Expected: 5 <-> 10 <-> 15 <-> 20 <-> 30 <-> null
        dll.displayReverse();

        System.out.println("3. Get element at index 3:");
        System.out.println("   → Element at index 3: " + dll.get(3)); // Expected: 20

        System.out.println("4. Check if list contains 15:");
        System.out.println("   → Contains 15? " + dll.contains(15)); // Expected: true

        System.out.println("5. Check if list contains 99:");
        System.out.println("   → Contains 99? " + dll.contains(99)); // Expected: false

        System.out.println("6. Remove element 10:");
        dll.remove(10);
        dll.display(); // Expected: 5 <-> 15 <-> 20 <-> 30 <-> null
        dll.displayReverse();

        System.out.println("7. Remove head (5):");
        dll.remove(5);
        dll.display(); // Expected: 15 <-> 20 <-> 30 <-> null
        dll.displayReverse();

        System.out.println("8. Remove tail (30):");
        dll.remove(30);
        dll.display(); // Expected: 15 <-> 20 <-> null
        dll.displayReverse();

        System.out.println("9. Size of the list:");
        System.out.println("   → Size: " + dll.size()); // Expected: 2

        System.out.println("10. Is list empty?");
        System.out.println("   → Empty? " + dll.isEmpty()); // Expected: false

        System.out.println("11. Clearing the list:");
        dll.clear();
        dll.display(); // Expected: null
        dll.displayReverse(); // Expected: null

        System.out.println("12. Is list empty after clear?");
        System.out.println("   → Empty? " + dll.isEmpty()); // Expected: true
    }
}
