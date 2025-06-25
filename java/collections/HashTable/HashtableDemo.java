import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> students = new Hashtable<>();

        students.put(101, "Sudipto");
        students.put(102, "Zain");
        students.put(103, "Varsha");
        students.put(104, "Ahmed");
        students.put(105, "Priya");
        students.put(106, "Sai");

        System.out.println("Student Records in Hashtable:");
        Set<Integer> keys = students.keySet();

        for (Integer key : keys) {
            String value = students.get(key);
            System.out.println("Roll No: " + key + " → Name: " + value);
        }
    }
}



