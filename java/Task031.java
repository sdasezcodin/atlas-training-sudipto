public class Task031 {
    public static void main(String[] args) {
        // Test values
        final int num1 = 25;
        final int num2 = 7;

        // Create instance of the most advanced calculator
        AdvancedCalculator calculator = new AdvancedCalculator();

        System.out.println("Calculator Inheritance Demonstration");
        System.out.println("----------------------------------");

        // Test operations from all inheritance levels
        System.out.println("\nBasic Operations:");
        calculator.add(num1, num2);        // From BasicCalculator
        calculator.subtract(num1, num2);   // From BasicCalculator

        System.out.println("\nScientific Operations:");
        calculator.multiply(num1, num2);   // From ScientificCalculator
        calculator.power(2, 5);            // From ScientificCalculator

        System.out.println("\nAdvanced Operations:");
        calculator.modulo(num1, num2);     // From AdvancedCalculator

    }
}

class BasicCalculator {
    protected int result;  // Accessible by child classes to store calculation results

    public void add(int x, int y) {
        result = x + y;
        System.out.println("Sum: " + result);
    }

    public void subtract(int x, int y) {
        result = x - y;
        System.out.println("Difference: " + result);
    }
}

class ScientificCalculator extends BasicCalculator {

    public void multiply(int x, int y) {
        result = x * y;  // Uses inherited 'result' field
        System.out.println("Product: " + result);
    }

    public void power(int base, int exponent) {
        result = (int) Math.pow(base, exponent);
        System.out.println("Power: " + result);
    }
}

class AdvancedCalculator extends ScientificCalculator {

    public void modulo(int dividend, int divisor) {
        result = dividend % divisor;
        System.out.println("Modulo: " + result);
    }
}
