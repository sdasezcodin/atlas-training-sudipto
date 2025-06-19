class OuterClass1 {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class Task044 {
    public static void main(String[] args) {
        OuterClass1.InnerClass myInner = new OuterClass1.InnerClass(); // ✅ valid because InnerClass is static
        // OuterClass myOuter = new OuterClass(); // ❌ Not needed here

        System.out.println(myInner.y /* + myOuter.x */);  // Accessing only y
    }
}
