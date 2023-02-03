

public class Overloading {

    public void m1(){
        System.out.println("--> no-args method called");
    }
    public void m1(int i){
        System.out.println("--> int-args method called");
    }
    public void m1(double d){
        System.out.println("--> double-args method called");
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.m1(); //no-args
        o.m1(10); //int-args
        o.m1(10.5); //double-args
        o.m1(10l);
        o.m1(10.5);
    }
}
