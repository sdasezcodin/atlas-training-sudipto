public class Task032 {
    public static void main(String[] args) {
        MyCalculation obj = new MyCalculation();
        obj.add(5, 10);
        obj.setTime(3);
        obj.showBoth();
    }
}

class Clock {
    protected int hours;

    public void setTime(int h) {
        hours = h;
        System.out.println("Time set to: " + hours + ":00");
    }
}

class Calculation {
    protected int result;

    public void add(int x, int y) {
        result = x + y;
        System.out.println("Sum: " + result);
    }
}

// ❌ This will cause a compilation error because Java doesn't support multiple inheritance using classes.
class MyCalculation extends Calculation, Clock {
    public void showBoth() {
        System.out.println("Result: " + result + ", Time: " + hours);
    }
}

