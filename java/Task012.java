import java.util.Scanner;

// Class to validate login ID and password using do-while loop.
class LoginCheck {
    // Method to repeatedly prompt user until correct login credentials are entered
    void validate(String correctId, String correctPwd) {
        Scanner scanner = new Scanner(System.in);
        String inputId, inputPwd;

        do {
            // Input login ID
            System.out.print("Enter Login ID: ");
            inputId = scanner.nextLine();

            // Input password
            System.out.print("Enter Password: ");
            inputPwd = scanner.nextLine();

            // Check if input matches correct credentials
            if (!inputId.equals(correctId) || !inputPwd.equals(correctPwd)) {
                System.out.println("Invalid Login ID or Password. Please try again.\n");
            }
        } while (!inputId.equals(correctId) || !inputPwd.equals(correctPwd));

        System.out.println("Login successful!");
        scanner.close();
    }
}

public class Task012 {
    public static void main(String[] args) {
        // Correct login credentials
        String loginid = "sd";
        String pwd = "123";

        // Create LoginCheck object and validate user input
        LoginCheck checker = new LoginCheck();
        checker.validate(loginid, pwd);
    }
}
