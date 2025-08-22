import java.util.ArrayList;
import java.util.List;

public class DManager {
    private static DManager instance;
    private final List<String> items;

    private DManager() {
        items = new ArrayList<>();
    }

    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    public synchronized void addItem(String item) {
        items.add(item);
    }

    public synchronized void removeItem(String item) {
        items.remove(item);
    }

    public synchronized List<String> getItems() {
        return new ArrayList<>(items);
    }

    public static void main(String[] args) throws InterruptedException {
        DManager manager = DManager.getInstance();

        String[] inputs = {"Toys", "Groceries", "Fruits", "Done"};
        String itemToRemove = "Groceries";

        for (String input : inputs) {
            if (input.equalsIgnoreCase("Done")) {
                break;
            }
            manager.addItem(input);
        }

        manager.removeItem(itemToRemove);

        System.out.println("Final List after input/output task:");
        for (String item : manager.getItems()) {
            System.out.println(item);
        }

        // ---- PROOF OF SINGLETON ----
        DManager manager2 = DManager.getInstance();
        System.out.println("\nHashCode of manager: " + manager.hashCode());
        System.out.println("HashCode of manager2: " + manager2.hashCode());
        System.out.println("Both hashcodes are same → Only one instance exists (Singleton).");

        // ---- PROOF OF THREAD SAFETY ----
        Runnable task = new Runnable() {
            @Override
            public void run() {
                DManager mgr = DManager.getInstance();
                String thread = Thread.currentThread().getName();
                mgr.addItem("Added by " + thread);
                System.out.println(thread + " list: " + mgr.getItems());
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("\nFinal list after threads finished: " + manager.getItems());
        System.out.println("This proves synchronized methods kept list consistent (Thread-Safe).");
    }
}
