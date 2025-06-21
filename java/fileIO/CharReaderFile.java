import java.io.*;

public class CharReaderFile {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader ("FileName03.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
            System.out.println("\nReading complete");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
