// Strategy Interface
interface GreetingStrategy {
    void greet(String name);
}

// Concrete Strategies
class CasualGreeting implements GreetingStrategy {
    public void greet(String name) {
        System.out.println("Hey " + name + "!");
    }
}
class FormalGreeting implements GreetingStrategy {
    public void greet(String name) {
        System.out.println("Good evening, " + name + ".");
    }
}

// Context
class Greeter {
    private GreetingStrategy strategy;
    public Greeter(GreetingStrategy strategy) { this.strategy = strategy; }
    public void setStrategy(GreetingStrategy strategy) { this.strategy = strategy; }
    public void greet(String name) { strategy.greet(name); }
}

// Demo
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(new CasualGreeting());
        greeter.greet("Alex");

        greeter.setStrategy(new FormalGreeting());
        greeter.greet("Alex");
    }
}

