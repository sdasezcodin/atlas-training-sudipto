import java.io.FileReader;
import java.io.IOException;

public class NonBufferReaderExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("largefile.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
