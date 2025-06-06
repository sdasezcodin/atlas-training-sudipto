public class Task024 {
    public static void main(String[] args) {
        // declares and initializes an array of StudentTask024 objects
        StudentTask024[] myStudents = new StudentTask024[]{
                new StudentTask024("Alex"),
                new StudentTask024("Maria"),
                new StudentTask024("James"),
                new StudentTask024("Sophia")
        };

        // accessing the elements of the array using for-each loop
        for(StudentTask024 student : myStudents) {
            System.out.println(student);
        }
    }
}

class StudentTask024 {
    public String name;

    // Constructor
    StudentTask024(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}