public class Task040 {
    public static void main(String[] args) {
        Gadgets remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}

abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

