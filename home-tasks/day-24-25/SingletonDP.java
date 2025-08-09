class SingletonDemo {
    private static SingletonDemo instance;
    private SingletonDemo() {
        System.out.println("initiating the singleton");
    }
    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
            System.out.println("in get instance");
        }
        return instance;
    }
    public void doHere() {
        System.out.println("doing here something");
    }
}
public class SingletonDP {
    public static void main(String[] args) {
        SingletonDemo obj1 = SingletonDemo.getInstance();
        obj1.doHere();

        SingletonDemo obj2 = SingletonDemo.getInstance();
        obj2.doHere();

        System.out.println(obj1 == obj2); // true, proving it's the same object
    }
}
