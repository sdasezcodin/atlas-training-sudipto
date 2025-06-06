import java.util.Scanner;

// Class to validate login ID and password using while loop.
class LoginValidator {
    // Method to repeatedly prompt user until correct login credentials are entered
    void validate(String correctId, String correctPwd) {
        Scanner scanner = new Scanner(System.in);
        String inputId, inputPwd;

        // Loop until correct credentials are entered
        while (true) {
            // Input login ID
            System.out.print("Enter Login ID: ");
            inputId = scanner.nextLine();

            // Input password
            System.out.print("Enter Password: ");
            inputPwd = scanner.nextLine();

            // Check if input matches correct credentials
            if (inputId.equals(correctId) && inputPwd.equals(correctPwd)) {
                System.out.println("Login successful!");
                break;  // Exit loop on success
            } else {
                System.out.println("Invalid Login ID or Password. Please try again.\n");
            }
        }
        scanner.close();
    }
}

public class Task011 {
    public static void main(String[] args) {
        // Correct login credentials
        String loginid = "sd";
        String pwd = "123";

        // Create LoginValidator object and validate user input
        LoginValidator validator = new LoginValidator();
        validator.validate(loginid, pwd);
    }
}
