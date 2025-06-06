public class Task039 {
    public static void main(String[] args) {
        // AbstractEmployee e = new AbstractEmployee("George"); // ❌ Not allowed.
        SalariedEmp se = new SalariedEmp("George", 52000);
        se.mailCheck();
        System.out.println("Computed weekly pay: " + se.computePay());
    }
}

abstract class AbstractEmployee {
    private String name;

    public AbstractEmployee(String name) {
        this.name = name;
    }
    // Abstract method (no body) — subclass must implement this
    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing a check to " + name);
    }
    public String getName() {
        return name;
    }
}
// Concrete subclass implementing the abstract method
class SalariedEmp extends AbstractEmployee {
    private double salary;
    public SalariedEmp(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public double computePay() {
        return salary / 52; // weekly pay
    }
    @Override
    public void mailCheck() {
        System.out.println("Mailing check to salaried employee " + getName() + " with annual salary " + salary);
    }
}

