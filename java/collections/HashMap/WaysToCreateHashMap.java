import java.util.HashMap;

public class WaysToCreateHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Apple", 10);
        hm1.put("Banana", 20);

        HashMap<String, Integer> hm2 = new HashMap<>(10);
        hm2.put("Cat", 30);
        hm2.put("Dog", 40);

        HashMap<String, Integer> hm3 = new HashMap<>(hm2);

        HashMap<String, Integer> hm4 = new HashMap<>(20, 0.5f);
        hm4.put("Elephant", 50);
        hm4.put("Fox", 60);

        System.out.println("HashMap 1 (Default): " + hm1);
        System.out.println("HashMap 2 (Initial Capacity 10): " + hm2);
        System.out.println("HashMap 3 (Copy of Map 2): " + hm3);
        System.out.println("HashMap 4 (Capacity 20, Load Factor 0.5): " + hm4);
    }
}


