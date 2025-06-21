class SyncBlockCounter {
    private int count = 0;
    public void increment() {
        synchronized (this) {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}

class SyncBlockRunnable implements Runnable {
    SyncBlockCounter counter;

    SyncBlockRunnable(SyncBlockCounter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Thread-safe access
        }
    }
}

public class SyncBlock {
    public static void main(String[] args) throws InterruptedException {
        SyncBlockCounter counter = new SyncBlockCounter();
        Thread t1 = new Thread(new SyncBlockRunnable(counter));
        Thread t2 = new Thread(new SyncBlockRunnable(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Count (Task 6): " + counter.getCount()); // Expected: 2000
    }
}


/*
A SyncBlockCounter object is created with an increment() method.
Inside increment(), only the count++ line is synchronized using synchronized(this), meaning:
Only one thread can execute the critical section at a time on the same object.
Two threads (t1 and t2) are created using SyncBlockRunnable, both sharing the same SyncBlockCounter instance.
Each thread runs a loop of 1000 iterations, calling counter.increment().
t1.start() and t2.start() → both threads run concurrently.
Whenever a thread reaches the synchronized block, it locks the counter object:
The other thread must wait until the lock is released.
main() waits for both threads to complete using join().
 */
