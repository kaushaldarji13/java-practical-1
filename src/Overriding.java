class X{
    public void property(){
        System.out.println("cash+land+gold");
    }
    public void marry(){
        System.out.println("xyz lady");
    }
}
class Y extends X{
    public void marry(){
        System.out.println("Xyz his crush");
    }
}
// I CAN DO IT

public class Overriding {
    public static void main(String[] args) {
        X x = new X();
        x.marry();          // parent method
        Y y = new Y();
        y.marry();          // child method
        X x1 = new Y();
        x1.marry();         // child method
    }
}
