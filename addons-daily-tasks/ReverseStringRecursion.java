public class ReverseStringRecursion {
    public String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        ReverseStringRecursion obj = new ReverseStringRecursion();
        String input = "hello";
        String reversed = obj.reverse(input);
        System.out.println("Reversed: " + reversed);
    }
}
