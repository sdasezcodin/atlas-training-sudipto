import java.io.*;

public class FileStreamReadByte {
    public static void main(String args[]) {
        FileInputStream infile = null;
        int b;
        try {
            infile = new FileInputStream("FileName01.txt");
            while((b = infile.read()) != -1) {
                System.out.print((char)b);
            }
            infile.close();
        } catch(IOException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
    }
}