import java.lang.FunctionalInterface;

    // This is a functional interface
    @FunctionalInterface
    interface MyInterface {
        // Abstract method
        double getPiValue();
    }

    public class LamdaExample {
        public static void main(String[] args) {
            // Declare a reference to MyInterface using lambda expression
            MyInterface ref = () -> 3.1415;

            // Call the method
            System.out.println("Pi value: " + ref.getPiValue());
        }
    }


