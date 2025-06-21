class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    ThreadDemo( String name){
        threadName = name;
        System.out.println("Creating " + threadName );
    }
    public void run() {
        System.out.println("Running " + threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
// Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");

    }
    public void start ()
    {
        System.out.println("Starting " + threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
public class ThreadShowcase {
    public static void main(String args[]) {
        ThreadDemo T1 = new ThreadDemo( "Thread-1");
        T1.start();
        ThreadDemo T2 = new ThreadDemo( "Thread-2");
        T2.start();
    }
}

/*
Summary
using the Runnable interface and a separate Thread object to start execution.
Each thread prints countdown from 4 to 1 with a delay of 50ms.
Threads run in parallel, so output is interleaved.
used a custom start() method, not the default from Thread, but it internally creates and starts the thread.
 */