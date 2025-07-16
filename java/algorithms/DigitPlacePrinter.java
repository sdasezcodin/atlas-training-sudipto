import java.util.Scanner;

public class DigitPlacePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (up to 6 digits): ");
        int num = sc.nextInt();

        int place = 0;
        String[] labels = {
                "units digit is ",
                "ones digit is ",
                "hundreds digit is ",
                "thousands digit is ",
                "10 thousands digit is ",
                "lakhs digit is "
        };

        while (num > 0 && place < labels.length) {
            int digit = num % 10;
            System.out.println(labels[place] + digit);
            num = num / 10;
            place++;
        }

        sc.close();
    }
}
