import java.util.HashMap;
import java.util.Map;

enum Element {
    HYDROGEN("Hydrogen", 1, 1.008f),
    HELIUM("Helium", 2, 4.0026f),
    NEON("Neon", 10, 20.180f);

    private final String name;
    private final int atomicNumber;
    private final float atomicWeight;

    // Static maps for fast lookup
    private static final Map<String, Element> BY_NAME = new HashMap<>();
    private static final Map<Integer, Element> BY_NUMBER = new HashMap<>();
    private static final Map<Float, Element> BY_WEIGHT = new HashMap<>();

    // Static initialization block to populate lookup maps
    static {
        for (Element element : Element.values()) {
            BY_NAME.put(element.name, element);
            BY_NUMBER.put(element.atomicNumber, element);
            BY_WEIGHT.put(element.atomicWeight, element);
        }
    }

    // Constructor
    Element(String name, int atomicNumber, float atomicWeight) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAtomicNumber() {
        return atomicNumber;
    }
    public float getAtomicWeight() {
        return atomicWeight;
    }

    // Lookup methods
    public static Element byName(String name) {
        return BY_NAME.get(name);
    }

    public static Element byNumber(int number) {
        return BY_NUMBER.get(number);
    }

    public static Element byWeight(float weight) {
        return BY_WEIGHT.get(weight);
    }

    @Override
    public String toString() {
        return String.format(
                "Element[name=%s, number=%d, weight=%.3f]",
                name, atomicNumber, atomicWeight
        );
    }
}

public class Task019 {
    public static void main(String[] args) {

        Element hydrogen = Element.byName("Hydrogen");
        Element helium = Element.byNumber(2);
        Element neon = Element.byWeight(20.180f);

        System.out.println(hydrogen);
        System.out.println(helium);
        System.out.println(neon);
    }
}