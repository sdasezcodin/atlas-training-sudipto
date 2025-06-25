import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        // HashMap 1: Student Names
        HashMap<Integer, String> studentNames = new HashMap<>();
        studentNames.put(101, "Alice");
        studentNames.put(102, "Bob");
        studentNames.put(103, "Charlie");

        // HashMap 2: Student Grades
        HashMap<Integer, String> studentGrades = new HashMap<>();
        studentGrades.put(101, "A");
        studentGrades.put(102, "B+");
        studentGrades.put(103, "A-");

        System.out.println("Student Name List:");
        Set<Integer> nameKeys = studentNames.keySet();
        for (Integer key : nameKeys) {
            System.out.println("Roll No: " + key + " → Name: " + studentNames.get(key));
        }

        System.out.println("\nStudent Grade List:");
        Set<Integer> gradeKeys = studentGrades.keySet();
        for (Integer key : gradeKeys) {
            System.out.println("Roll No: " + key + " → Grade: " + studentGrades.get(key));
        }

        System.out.println(studentNames);
    }
}

