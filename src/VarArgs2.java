public class VarArgs2 {
    public static void m1(int ... x){
        System.out.println("Var-args method called");
    }

    public static void m1(int  x){
        System.out.println("General method called");
    }

    public static void main(String args[]){
        m1();
        m1(10,20);
        m1(10);
    }

}
