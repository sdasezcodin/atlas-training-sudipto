class Heart {
    void pump() {
        System.out.println("Heart is pumping...");
    }
}

class Human {
    private Heart heart;  // Composition: Heart is part of Human, cannot exist without Human

    public Human() {
        this.heart = new Heart();  // Created inside Human
    }

    void startLife() {
        heart.pump();
        System.out.println("Human is alive.");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Human human = new Human();
        human.startLife();
    }
}
