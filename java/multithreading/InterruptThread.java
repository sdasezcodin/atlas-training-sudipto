class InterruptibleThread extends Thread {
    @Override
    public void run() {
        try {

            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running");
                Thread.sleep(100); // May throw InterruptedException
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted during sleep");
        }

        System.out.println("Thread exiting gracefully...");
    }
}

public class InterruptThread {
    public static void main(String[] args) {
        InterruptibleThread thread = new InterruptibleThread();
        thread.start(); // Start the thread

        try {
            Thread.sleep(500); // Let the thread run for a while
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        thread.interrupt();
    }
}
