class Employee {
    private String name;
    private String email;
    private double salary;
    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getSalary() {
        return salary;
    }
}
class ReportGenerator {
    public void generatePdfReport(Employee employee) {
        System.out.println("Generating PDF report for: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
    }
}

class EmailSender {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to: " + recipient);
        System.out.println("Message: " + message);
    }
}
public class SRP {
    public static void main(String[] args) {
        Employee emp = new Employee("eZcoDiN", "ezcodin@example.com", 75000.0);
        ReportGenerator reportGen = new ReportGenerator();
        reportGen.generatePdfReport(emp);
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(emp.getEmail(), "Your salary slip has been generated.");
    }
}
