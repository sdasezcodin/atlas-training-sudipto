import java.util.HashMap;
import java.util.Map;

public class HashMapNullDemo {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put(null, "FirstNullKeyValue");

        map.put(null, "UpdatedNullKeyValue");

        map.put("A", null);
        map.put("B", null);
        map.put("C", null);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}
