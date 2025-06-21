
    @FunctionalInterface
    interface MyInterface1 {
        // Abstract method to reverse a string
        String reverse(String n);
    }

    public class ReverseLamda {
        public static void main(String[] args) {
            // Lambda expression assigned to interface reference
            MyInterface1 ref = (str) -> {
                String result = "";
                for (int i = str.length() - 1; i >= 0; i--)
                    result += str.charAt(i);
                return result;
            };

            // Call the method
            System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
        }
    }


