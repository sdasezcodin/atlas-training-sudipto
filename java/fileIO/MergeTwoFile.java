import java.io.*;

class MergeTwoFile {
    public static void main(String args[]) {
        try {
            // Input files
            FileInputStream file1 = new FileInputStream("NewFile01.txt");
            FileInputStream file2 = new FileInputStream("NewFile02.txt");

            // SequenceInputStream to combine file1 and file2
            SequenceInputStream file3 = new SequenceInputStream(file1, file2);

            // Output file (merged result)
            FileOutputStream outFile = new FileOutputStream("MergedFile1.txt");

            int ch;
            while ((ch = file3.read()) != -1) {
                outFile.write(ch);
            }

            // Close all streams
            file1.close();
            file2.close();
            file3.close();
            outFile.close();

            System.out.println("Merged two files successfully into MergedFile.txt");
        } catch (IOException e) {
            System.out.println("Sorry..!! File Not Found or Error Occurred...!!!");
        }
    }
}
