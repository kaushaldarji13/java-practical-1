class B{
    public static void m1(){
        System.out.println("Parent");
    }
}
class D extends B{
    public static void m1(){
        System.out.println("Child");
    }
}
public class Overriding1 {
    public static void main(String[] args) {
        B b = new B();
        b.m1();             // parent

        D d = new D();
        d.m1();             // Child

        B b1 = new D();
        b1.m1();            //  parent
    }
}
