import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class SynchronizedHashMap {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> normalMap = new HashMap<>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());

        Runnable task1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                String key = "T1_" + i;
                normalMap.put(key, i);        // Unsafe
                syncMap.put(key, i);          // Safe

            }
        };

        Runnable task2 = () -> {
            for (int i = 1001; i <= 2000; i++) {
                String key = "T2_" + i;
                normalMap.put(key, i);        // Unsafe
                syncMap.put(key, i);          // Safe
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Normal HashMap size:        " + normalMap.size());
        System.out.println("Synchronized HashMap size:  " + syncMap.size());

    }
}




