public class Task020 {
    public static void main(String[] args) {
        char[] name = {'s', 'u', 'd', 'i', 'p', 't', 'o'};

        System.out.println("Full name: " + String.valueOf(name));
        System.out.println("Length: " + name.length);

        System.out.println("\nBreaking down the name:");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Character " + (i+1) + ": '" + name[i] + "'");
        }
    }
}
