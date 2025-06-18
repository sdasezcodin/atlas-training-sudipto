// Base class Person (common parent for all other classes)
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
// Customer class inheriting from Person
class Customer extends Person {
    String customerId;
    double purchaseAmount;
    public Customer(String name, int age, String customerId, double purchaseAmount) {
        super(name, age);
        this.customerId = customerId;
        this.purchaseAmount = purchaseAmount;
    }
    @Override
    public String toString() {
        return super.toString() + ", Customer ID: " + customerId + ", Purchase Amount: $" + purchaseAmount;
    }
}
// Employee class inheriting from Person
class Employee extends Person {
    String employeeId;
    double salary;
    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + ", Employee ID: " + employeeId + ", Salary: $" + salary;
    }
}
// Manager class inheriting from Employee
class Manager extends Employee {
    String department;
    int teamSize;
    public Manager(String name, int age, String employeeId, double salary, String department, int teamSize) {
        super(name, age, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Team Size: " + teamSize;
    }
}
// Driver class to test the inheritance hierarchy
public class Task014_Hierarchy {
    public static void main(String[] args) {
        // Create objects of each class
        Customer customer = new Customer("John Doe", 35, "CUST123", 499.99);
        Employee employee = new Employee("Jane Smith", 28, "EMP456", 65000);
        Manager manager = new Manager("Mike Johnson", 42, "MGR789", 90000, "Sales", 8);
        // Display all information using toString()
        System.out.println("=== Customer Information ===");
        System.out.println(customer);
        System.out.println("\n=== Employee Information ===");
        System.out.println(employee);
        System.out.println("\n=== Manager Information ===");
        System.out.println(manager);
    }
}