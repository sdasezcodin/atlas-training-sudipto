import java.util.HashMap;
import java.util.Map;

interface Shape {
    void draw(int x, int y);
}

class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
        System.out.println("Creating circle of color: " + color);
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + color + " circle at (" + x + ", " + y + ")");
    }
}

class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}

public class FlyweightDemo {
    public static void main(String[] args) {
        Shape redCircle1 = ShapeFactory.getCircle("Red");
        redCircle1.draw(10, 20);

        Shape redCircle2 = ShapeFactory.getCircle("Red");
        redCircle2.draw(30, 40);

        Shape blueCircle = ShapeFactory.getCircle("Blue");
        blueCircle.draw(50, 60);
    }
}

















