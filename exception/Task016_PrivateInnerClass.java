/*
public class Task016_PrivateInnerClass {
        int x = 10;

        private class InnerClass {
            int y = 5;
        }
    }

    public class Main {
        public static void main(String[] args) {
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass(); // ❌ Error
            System.out.println(myInner.y + myOuter.x);
        }
}

*/