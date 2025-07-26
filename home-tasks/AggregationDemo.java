class Engine {
    void start() {
        System.out.println("Engine starts...");
    }
}

class Car {
    private Engine engine;  // Aggregation: Car has an Engine, but Engine can exist without Car

    public Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
        System.out.println("Car is running.");
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Engine engine = new Engine();  // Engine can exist independently
        Car car = new Car(engine);     // Inject engine into car
        car.startCar();
    }
}
