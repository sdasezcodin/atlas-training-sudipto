public class Task009_ThrowException {
    // Demonstrating how to throw an exception

        // Method declares it may throw IllegalAccessException
        static void fun() throws IllegalAccessException {
            System.out.println("Inside fun().");
            // Throwing an exception manually using 'throw'
            throw new IllegalAccessException("demo");
        }

        public static void main(String args[]) {
            try {
                fun();  // Calling method that may throw exception

                // method2();   → Can be used to simulate ArrayIndexOutOfBoundsException
                // method3();   → Can be used to simulate FileNotFoundException

            } catch (IllegalAccessException e) {
                System.out.println("Caught in main.");
            }
        }
    }


