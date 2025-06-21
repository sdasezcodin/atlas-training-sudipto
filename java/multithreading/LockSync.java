import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class LockCounter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();
    public void increment() {
        lock.lock(); // Acquire the lock
        try {
            count++;
        } finally {
            lock.unlock(); // Always release lock in finally
        }
    }
    public int getCount() {
        return count;
    }
}
class LockRunnable implements Runnable {
    LockCounter counter;

    LockRunnable(LockCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class LockSync {
    public static void main(String[] args) throws InterruptedException {
        LockCounter counter = new LockCounter();
        Thread t1 = new Thread(new LockRunnable(counter));
        Thread t2 = new Thread(new LockRunnable(counter));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count (Task 8): " + counter.getCount()); // Expected: 2000
    }
}


/*
In main(), two threads (t1, t2) are created and passed the same LockCounter object.
Both threads execute the run() method in LockRunnable, which calls counter.increment() in a loop 1000 times.
Inside increment():
Thread acquires the lock using lock.lock().
Increments the count.
Always releases the lock in the finally block using lock.unlock(). This guarantees that even if an exception occurs, the lock is released.
Since both threads share the same LockCounter instance and lock, only one thread can increment at a time.
 */

