class OuterClass {
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}
public class Task015_InnerClass {
    public static void main(String[] args) {
      //  OuterClass myOuter = new OuterClass();
       // OuterClass myouter;

        OuterClass.InnerClass myInner = new OuterClass.InnerClass();


        System.out.println(myInner.y );
    }
}




