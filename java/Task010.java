import java.util.Scanner;

// Class to check weekday name based on number input
class WeekdayChecker {
    // Method to print the day of the week based on the input number
    void checkDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

public class Task010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number for the weekday
        System.out.print("Enter a number (1 to 7): ");
        int day = scanner.nextInt();

        // Create WeekdayChecker object
        WeekdayChecker checker = new WeekdayChecker();

        // Check and print the weekday name
        checker.checkDay(day);

        scanner.close();
    }
}
