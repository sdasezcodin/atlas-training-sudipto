class StaticSyncCounter {
    private static int count = 0;
    public static synchronized void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

class StaticSyncRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            StaticSyncCounter.increment(); // Class-level thread-safe
        }
    }
}

public class StaticSync {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new StaticSyncRunnable());
        Thread t2 = new Thread(new StaticSyncRunnable());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (Task 7): " + StaticSyncCounter.getCount());
    }
}

/*
main() method starts and creates two threads (t1, t2), both running the same task: StaticSyncRunnable.
Each thread enters the run() method, and runs a loop from 0 to 999:
In each iteration, it calls StaticSyncCounter.increment().
Since increment() is static synchronized:
Java uses a class-level lock on StaticSyncCounter.class.
Only one thread at a time can enter the method, even if they’re working on the same class but different instances (or no instances at all).
Each call to increment() increases the shared static count by 1.
 */