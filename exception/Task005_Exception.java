public class Task005_Exception {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];    // array of size 2 (index 0 and 1)
            int b = 0;
            int c = 1 / b;          // ❌ This will throw ArithmeticException
            System.out.println("Access element three: " + a[3]); // ❌ Won’t be executed
        }

        // This block is skipped because ArithmeticException occurs first
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown: " + e);
        }

        // This catches the ArithmeticException
        catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }

        // This line executes after exception is handled
        System.out.println("Out of the block");
    }
}
