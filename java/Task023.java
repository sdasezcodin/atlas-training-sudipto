public class Task023 {

    public static void main(String[] args) {

        // declares an Array of StudentTask023
        StudentTask023[] arr;

        // allocating memory for 5 objects of type StudentTask023.
        arr = new StudentTask023[5];

        // initialize the elements of the array
        arr[0] = new StudentTask023(101, "John");
        arr[1] = new StudentTask023(102, "Emily");
        arr[2] = new StudentTask023(103, "Michael");
        arr[3] = new StudentTask023(104, "Sarah");
        arr[4] = new StudentTask023(105, "David");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                    + arr[i].roll_no + " "
                    + arr[i].name + " }");
    }
}

class StudentTask023 {
    public int roll_no;
    public String name;

    StudentTask023(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}