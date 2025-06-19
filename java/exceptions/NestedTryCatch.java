public class NestedTryCatch {

    public static void main(String args[]) {
            try {
                int a[] = new int[2];

                // Inner try block
                try {
                    int b = 0;
                    int c = 1/b;  // ArithmeticException
                } catch(Exception e) {
                    System.out.println("Exception thrown: " + e);
                }

                System.out.println("Access element three :" + a[3]);  // ArrayIndexOutOfBoundsException
            }

            // Outer catch block
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown: " + e);
            }

            System.out.println("Out of the block");
        }

}
