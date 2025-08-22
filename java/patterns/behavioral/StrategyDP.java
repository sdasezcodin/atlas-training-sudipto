import java.util.*;

interface SortingStrategy {
    void sort(List<String> items);
}

class AlphabeticalSorting implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
    }
}

class LengthwiseSorting implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, (a, b) -> Integer.compare(a.length(), b.length()));
    }
}

class SortingContext {
    private SortingStrategy strategy;
    private List<String> items = new ArrayList<>();

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void performSort() {
        if (strategy != null) {
            strategy.sort(items);
        } else {
            System.out.println("No sorting strategy set!");
        }
    }

    public List<String> getList() {
        return items;
    }
}

public class StrategyDP {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();

        // Adding items
        context.addItem("Stanford");
        context.addItem("Ankit");
        context.addItem("Watson");

        // Alphabetical Sorting
        context.setStrategy(new AlphabeticalSorting());
        context.performSort();
        System.out.println("Alpha sorting:");
        for (String s : context.getList()) {
            System.out.println(s);
        }

        System.out.println();

        // Lengthwise Sorting
        context.setStrategy(new LengthwiseSorting());
        context.performSort();
        System.out.println("Lengthwise sorting:");
        for (String s : context.getList()) {
            System.out.println(s);
        }
    }
}
