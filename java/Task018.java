// Class User with private name field and getter/setter methods
class User {
    private String name;

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the name
    public String getName() {
        return name;
    }
}

// Main class to test User class
public class Task018 {
    public static void main(String[] args) {
        User myObj = new User();             // Create User object
        myObj.setName("John");               // Set name to "John"
        System.out.println(myObj.getName()); // Print the name
    }
}
