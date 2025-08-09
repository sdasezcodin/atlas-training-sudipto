import java.util.ArrayList;
import java.util.List;

interface Component {
    void brandName();
}

class Leaf implements Component {
    private String brand;
    public Leaf(String brand) {
        this.brand = brand;
    }
    @Override
    public void brandName() {
        System.out.println("Brand: " + brand);
    }
}

class Composite implements Component {
    private List<Component> components = new ArrayList<>();
    private String groupName;

    public Composite(String groupName) {
        this.groupName = groupName;
    }
    public void add(Component subComponent) {
        components.add(subComponent);
    }
    public void remove(Component subComponent) {
        components.remove(subComponent);
    }
    @Override
    public void brandName() {
        System.out.println("Group: " + groupName);
        for (Component comp : components) {
            comp.brandName();
        }
    }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        Leaf dell = new Leaf("Dell");
        Leaf hp = new Leaf("HP");
        Leaf lenovo = new Leaf("Lenovo");

        Composite laptopBrands = new Composite("Laptop Brands");
        laptopBrands.add(dell);
        laptopBrands.add(hp);
        laptopBrands.add(lenovo);

        Composite electronics = new Composite("Electronics");
        electronics.add(laptopBrands);
        electronics.add(new Leaf("Sony"));

        electronics.brandName();
    }
}
