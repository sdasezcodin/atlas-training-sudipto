public class Task033 {
    public static void main(String[] args) {
        // Creating object of Mart class.
        Mart obj = new Mart();

        // Calling billing method
        obj.billing();
    }
}
class Customer {
    // Parent class variables
    String items = "Tomatoes";
    int cost = 40;
}

class Mart extends Customer {
    // Child class variables
    String items = "Onions";
    int cost = 30;

    // Method to display child and parent class variables
    void billing() {
        System.out.println("Child class item: " + items);        // Onions
        System.out.println("Child class cost: ₹" + cost);        // 30

        System.out.println("=========");

        // Using super keyword to access parent class variables
        System.out.println("Parent class item: " + super.items); // Tomatoes
        System.out.println("Parent class cost: ₹" + super.cost); // 40
    }
}

