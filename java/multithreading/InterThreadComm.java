class SharedResource {
    private boolean ready = false;
    synchronized void produce() {
        try {
            while (ready) {
                wait(); // Wait if already produced
            }
            System.out.println("Producing...");
            ready = true;
            notify(); // Notify consumer
        } catch (InterruptedException e) {e.printStackTrace();}
    }
    synchronized void consume() {
        try {
            while (!ready) {
                wait(); // Wait until something is produced
            }
            System.out.println("Consuming...");
            ready = false;
            notify(); // Notify producer
        } catch (InterruptedException e) {e.printStackTrace();}
    }
}
public class InterThreadComm {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.produce();
            }
        }, "Producer");
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.consume();
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}
