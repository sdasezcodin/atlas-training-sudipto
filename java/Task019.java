public class Task019 {
    public static void main(String[] args) {
        // Simple loop to display all elements
        System.out.println("All Chemical Elements:");
        for (Element element : Element.values()) {
            System.out.println(element);
        }
    }
}

enum Element {
    HYDROGEN("Hydrogen", 1, 1.008f),
    HELIUM("Helium", 2, 4.0026f),
    NEON("Neon", 10, 20.180f);

    private final String name;
    private final int atomicNumber;
    private final float atomicWeight;

    Element(String name, int atomicNumber, float atomicWeight) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    @Override
    public String toString() {
        return String.format("Element[name=%s, number=%d, weight=%.3f]",
                name, atomicNumber, atomicWeight);
    }
}

