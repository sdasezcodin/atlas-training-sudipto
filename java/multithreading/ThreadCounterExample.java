class SharedCounter {
    private int count = 0;
    public void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
class CounterThread extends Thread {
    SharedCounter counter;

    CounterThread(SharedCounter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}
public class ThreadCounterExample {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter.getCount());
    }
}
