public class RecursiveDigitOperations {
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        int number = 12345;

        int count = countDigits(number);
        int sum = sumOfDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Total digits: " + count);
        System.out.println("Sum of digits: " + sum);
    }
}
