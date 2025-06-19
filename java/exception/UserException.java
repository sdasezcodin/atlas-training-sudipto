class Customer420 extends Exception { // extends predefined class Exception
    public Customer420(String m) {    // constructor with parameter
        super(m);                  // call parent class constructor
    }
}

// A Class that uses the above Customer
public class Task013_UserException {
    public static void main(String args[]) {
        try {
            // Throw an object of user-defined exception
            throw new Customer420("This is a custom exception");
        }
        catch (Customer420 ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
