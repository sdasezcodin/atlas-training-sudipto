import java.io.*;

public class CharWriterFile {
    public static void main(String args[]) {
        // Create a File object representing "FileName03.txt"
        File f1 = new File("FileName03.txt");
        FileWriter fw = null; // Declare FileWriter object, initialized to null

        try {

            fw = new FileWriter(f1);

            // Write strings to the file
            fw.write("ahmedabad \n");
            fw.write("baroda \n");

            System.out.println("Write operation started..."); // Indicate that writing is in progress

        } catch (FileNotFoundException e) {

            System.out.println("Sorry..!! File Not Found...!!!" + e.getMessage());
        } catch (IOException e) {

            System.out.println("An I/O error occurred: " + e.getMessage());
        } finally {

            if (fw != null) {
                try {
                    fw.close(); // Close the FileWriter
                    System.out.println("File closed successfully.");
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
