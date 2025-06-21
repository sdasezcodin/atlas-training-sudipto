import java.io.*;

class FileCopyByte {
    public static void main(String args[]) {
        try {
            FileInputStream infile = new FileInputStream("FileName01.txt");
            FileOutputStream outfile = new FileOutputStream("NewFile06.txt");

            int byteread;
            while ((byteread = infile.read()) != -1) {
                outfile.write(byteread);
            }

            System.out.println("Byte copied from fileName01.txt to NewFile06.txt");

            infile.close();
            outfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
