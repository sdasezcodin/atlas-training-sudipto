import java.util.Scanner;

// Class to handle user login details.
class Login {
    // Method to return masked password and display login information
    void showLoginDetails(String id, String password) {
        // Mask the password using asterisks
        String maskedPwd = "*".repeat(password.length());

        // Display login information
        System.out.println("\nHi ,");
        System.out.println("\tYour login id is " + id);
        System.out.println("\t& \n\tyour pwd is " + maskedPwd);
    }
}

public class Task006 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter ID
        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();

        // Prompt user to enter password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Create Login object and display masked login details
        Login login = new Login();
        login.showLoginDetails(id, password);

        // Close the scanner to free resources
        scanner.close();
    }
}
