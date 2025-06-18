public class Task006_Exception {

        public static void main(String args[]) {
            try {
                int a[] = new int[2];
                int b = 5;
                int c = 1/b;
                System.out.println("Access element three :" + a[3]);
            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException thrown  :" + e);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
            }
            catch (Exception e) {
                System.out.println("Exception thrown  :" + e);
            }
            System.out.println("Out of the block");
        }

}
