// Class to represent a Customer with ID, Name, and Email
class Customer {
    // Private final fields for customer details (immutable after initialization)
    private final int id;           // Customer ID
    private final String name;      // Customer Name
    private final String email;     // Customer Email

    // Constructor to initialize customer object with ID, Name, and Email
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Method to display customer details
    void displayInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
    }
}

public class Task007 {
    public static void main(String[] args) {
        // Create a Customer object with sample data
        Customer customer = new Customer(333, "Sudip", "sudip@xyz.com");

        // Call method to display the customer's information
        customer.displayInfo();
    }
}
