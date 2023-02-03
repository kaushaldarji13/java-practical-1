package pack1;
public class ProtectedEx {
    protected void m1(){
        System.out.println("The most misunderstood modifier");
    }

}
class  B extends ProtectedEx{

    public static void main(String[] args) {
        ProtectedEx a = new ProtectedEx();
        a.m1();
        B b = new B();
        b.m1();
        ProtectedEx a1 = new B();
        a1.m1();


    }
}
