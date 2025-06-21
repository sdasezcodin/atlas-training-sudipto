import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamWriteByte {
    public static void main(String[] args) {
        File f1 = new File("FileName01.txt"); // Create new file
        FileOutputStream outfile = null;
        byte[] text = {'I', ' ', 'L', '0', 'v', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        try {
            outfile = new FileOutputStream(f1);
            outfile.write(text);
           // outfile.read(text);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                if (outfile != null) {
                    outfile.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
