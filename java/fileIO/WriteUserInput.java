import java.io.*;
import java.util.Scanner; // Import the Scanner class

public class WriteUserInput {
    public static void main(String args[]) {
        FileOutputStream outfile = null;
        Scanner sc = new Scanner(System.in); // Initialize Scanner to read input
        System.out.print("Enter a string to write to the file: ");
        String s = sc.nextLine(); // Read the string from the user

        byte b1[] = s.getBytes(); // Convert the string to an array of bytes
        try {
            outfile = new FileOutputStream("in.txt"); // Create or open in.txt for writing
            outfile.write(b1); // Write the bytes to the file
            System.out.println("Bytes successfully written to in.txt");
        } catch(IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(-1); // Exit with an error code
        } finally {
            // Always close the file output stream to prevent resource leaks
            if (outfile != null) {
                try {
                    outfile.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
            if (sc != null) {
                sc.close(); // Close the scanner
            }
        }
        System.out.println("Thank You...!!!");
    }
}