import java.util.LinkedList;

public class DisplayLinkedListElements {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Step 2: Add 5 elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Step 3: Display using for loop and get()
        System.out.println("Display using for loop with get():");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Step 4: Display using for-each loop
        System.out.println("\nDisplay using for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
