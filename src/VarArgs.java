public class VarArgs {
    public static void sum(int... a){
        System.out.println("var args methods " +a.length );
    }

    public static void main(String [] args){
        sum();
        sum(10);
        sum(10,20);
        sum(10,20,30,40);
    }
}
