import java.util.Scanner;

class LinearProbingHashTable {
    private int currentSize, maxSize;
    private String[] keys;
    private String[] vals;

    public LinearProbingHashTable(int capacity) {
        currentSize = 0;
        maxSize = capacity;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }

    public void makeEmpty() {
        currentSize = 0;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }

    public int getSize() {
        return currentSize;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean contains(String key) {
        return get(key) != null;
    }

    private int hash(String key) {
        return (key.hashCode() & 0x7fffffff) % maxSize;
    }

    public void insert(String key, String val) {
        if (isFull()) {
            System.out.println("Hash Table is full. Cannot insert.");
            return;
        }

        int tmp = hash(key);
        int i = tmp;

        do {
            if (keys[i] == null) {
                keys[i] = key;
                vals[i] = val;
                currentSize++;
                return;
            }

            if (keys[i].equals(key)) {
                vals[i] = val;
                return;
            }

            i = (i + 1) % maxSize;
        } while (i != tmp);
    }

    public String get(String key) {
        int i = hash(key);
        while (keys[i] != null) {
            if (keys[i].equals(key)) return vals[i];
            i = (i + 1) % maxSize;
        }
        return null;
    }

    public void remove(String key) {
        if (!contains(key)) {
            System.out.println("Key not found.");
            return;
        }

        int i = hash(key);
        while (!key.equals(keys[i])) i = (i + 1) % maxSize;

        // Remove the key
        keys[i] = null;
        vals[i] = null;
        currentSize--;

        // Reinsert affected keys
        for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize) {
            String tmpKey = keys[i];
            String tmpVal = vals[i];
            keys[i] = vals[i] = null;
            currentSize--;
            insert(tmpKey, tmpVal);
        }
    }

    public void printHashTable() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < maxSize; i++) {
            System.out.print("[" + i + "] ");
            if (keys[i] != null) System.out.println(keys[i] + " => " + vals[i]);
            else System.out.println("null");
        }
        System.out.println();
    }
}

public class LinearProbingHashTableTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n");

        System.out.print("Enter size of Hash Table: ");
        LinearProbingHashTable lpht = new LinearProbingHashTable(scan.nextInt());

        char ch;
        do {
            System.out.println("\nHash Table Operations");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Get");
            System.out.println("4. Clear");
            System.out.println("5. Size");

            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String keyToInsert = scan.next();
                    System.out.print("Enter value: ");
                    String valToInsert = scan.next();
                    lpht.insert(keyToInsert, valToInsert);
                    break;

                case 2:
                    System.out.print("Enter key to remove: ");
                    lpht.remove(scan.next());
                    break;

                case 3:
                    System.out.print("Enter key to get value: ");
                    String keyToGet = scan.next();
                    String value = lpht.get(keyToGet);
                    if (value != null) System.out.println("Value = " + value);
                    else System.out.println("Key not found.");
                    break;

                case 4:
                    lpht.makeEmpty();
                    System.out.println("Hash Table cleared.");
                    break;

                case 5:
                    System.out.println("Current Size = " + lpht.getSize());
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            lpht.printHashTable();

            System.out.print("Do you want to continue (y/n)? ");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

        scan.close();
    }
}
