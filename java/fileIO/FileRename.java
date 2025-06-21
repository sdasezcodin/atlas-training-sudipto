import java.io.*;

class FileRename {
    public static void main(String args[]) {
        // Check for required arguments
        if (args.length != 2) {
            System.out.println("Usage: java FileRenameDemo <oldfilename> <newfilename>");
            return;
        }

        File f1 = new File(args[0]); // Old file
        File f2 = new File(args[1]); // New file name

        // Check if the old file exists
        if (!f1.exists()) {
            System.out.println("File " + f1.getName() + " does not exist.");
            return;
        }

        // Attempt to rename
        if (f1.renameTo(f2)) {
            System.out.println("Renamed file '" + f1.getName() + "' to '" + f2.getName() + "' successfully.");
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}
