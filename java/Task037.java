public class Task037 {
    public static void main(String[] args) {
        Employee emp = new Employee(1234, 50000, 10001);
        // Accessing public variable directly
        System.out.println("Employee ID: " + emp.empId); // ✅ Public — accessible
        // Accessing protected variable (allowed here because we're in same package)
        System.out.println("Salary: " + emp.salary); // ✅ Protected — accessible
        // System.out.println("Password: " + emp.password); ❌ Not allowed (private)
        // Accessing private variable via getter (Encapsulation)
        System.out.println("Password: " + emp.getPassword()); // ✅ Access via getter
        // Updating private variable via setter
        emp.setPassword(9999);
        System.out.println("Updated Password: " + emp.getPassword());
    }
}

class Employee {
    // private: accessible only within this class
    private int password;
    // protected: accessible within same package (not useful here without inheritance)
    protected int salary;
    // public: accessible from anywhere
    public int empId;
    // Constructor to initialize values
    public Employee(int password, int salary, int empId) {
        this.password = password;
        this.salary = salary;
        this.empId = empId;
    }
    // Public getter method for private data (Encapsulation - data hiding)
    public int getPassword() {
        return password;
    }
    // Public setter method for private data (Encapsulation - controlled access)
    public void setPassword(int password) {
        this.password = password;
    }
}

