class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}

class MyRunnable implements Runnable {
    Counter counter;

    MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Safe access
        }
    }
}

public class SyncMethod {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new MyRunnable(counter));
        Thread t2 = new Thread(new MyRunnable(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (Task 5): " + counter.getCount()); // Expected: 2000
    }
}

/*
A Counter object is created with a synchronized increment() method.
Two threads (t1 and t2) are created using a MyRunnable class that:
Calls counter.increment() 1000 times in a loop.
Both threads share the same Counter instance, so:
increment() is synchronized on that instance.
Only one thread at a time can execute the increment() method.
t1.start() and t2.start() → both threads run concurrently.
main() waits for both threads to finish using join().
 */