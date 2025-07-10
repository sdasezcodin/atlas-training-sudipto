import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursionDemo {

    int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int ans = n * factorial(n - 1);
        return ans;
    }

    int fib (int n) {
        Map<Integer, Integer> map = new HashMap<>();
        if (n<2) {
            return n;
        }
        if(map.containsKey(n)) {
            return map.get(n);
        }
        int ans = fib(n-1) + fib (n-2);
        map.put(n,ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecursionDemo rd = new RecursionDemo();

        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is: " + rd.factorial(n));
        System.out.println("Fibonacci of " + n + " is: " + rd.fib(n));

        sc.close();
    }

}
