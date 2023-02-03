public class VarArgs1 {

    public static void sum(int... a){
        int total = 0;
        for (int a1 : a){
            total = total + a1;
        }
        System.out.println("the sum is:- "+total);
    }

    public static void main(String [] args){
        sum();
        sum(10);
        sum(10,20);
        sum(10,20,30,40);
    }
}
