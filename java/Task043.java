
class OuterClass11 {
        int x = 10;

        private class InnerClass {
            int y = 5;
        }
    }

    public class Task043 {
        public static void main(String[] args) {
            OuterClass11 myOuter = new OuterClass11();
            OuterClass11.InnerClass myInner = myOuter.new InnerClass(); // ❌ Error
            System.out.println(myInner.y + myOuter.x);
        }
}

