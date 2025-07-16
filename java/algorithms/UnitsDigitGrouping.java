import java.util.*;

public class UnitsDigitGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers separated by commas: ");
        String input = sc.nextLine();

        String[] parts = input.split(",");

        Map<Integer, List<Integer>> digitGroups = new HashMap<>();

        for (int i = 0; i <= 9; i++) {
            digitGroups.put(i, new ArrayList<>());
        }

        for (String part : parts) {
            int num = Integer.parseInt(part.trim());
            int unitDigit = Math.abs(num % 10); // in case of negative numbers

            digitGroups.get(unitDigit).add(num);
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println("Group " + i + ": " + digitGroups.get(i));
        }

        sc.close();
    }
}
