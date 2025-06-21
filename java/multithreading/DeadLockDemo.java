// Task 10: Deadlock Example

class Resource {
    // Synchronized method that calls method2 on another resource
    synchronized void method1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        try {
            Thread.sleep(100); // Simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.method2(this); // Call method2 on the passed resource
    }

    // Synchronized method that calls method1 on another resource
    synchronized void method2(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
        try {
            Thread.sleep(100); // Simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.method1(this); // Call method1 on the passed resource
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        final Resource r1 = new Resource();
        final Resource r2 = new Resource();

        // Thread-1 tries to acquire lock on r1 then r2
        Thread t1 = new Thread(() -> r1.method1(r2), "Thread-1");

        // Thread-2 tries to acquire lock on r2 then r1
        Thread t2 = new Thread(() -> r2.method1(r1), "Thread-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}
