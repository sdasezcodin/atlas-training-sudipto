import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Map 1: Student Names
        Map<String, String> studentNames = new HashMap<>();
        studentNames.put("101", "Alice");
        studentNames.put("102", "Bob");
        studentNames.put("103", "Charlie");

        // Map 2: Student Grades
        Map<Integer, String> studentGrades = new HashMap<>();
        studentGrades.put(101, "A");
        studentGrades.put(102, "B+");
        studentGrades.put(103, "A-");

        // Display Student Names using Map.Entry
        System.out.println("Student Name List:");
        for (Map.Entry<String, String> entry : studentNames.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " → Name: " + entry.getValue());
        }

        // Display Student Grades using Map.Entry
        System.out.println("\nStudent Grade List:");
        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " → Grade: " + entry.getValue());
        }

        // Print entire studentNames map
        System.out.println("\nRaw studentNames map: " + studentNames);
    }
}
