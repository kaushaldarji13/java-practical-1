public class  MainMethod {
    static {
        System.out.println("Static block executed");
//      System.exit(0);
    }
    //If we don't add main method our code won't compile
    public static void main(String [] args){

        System.out.println("main method executed");
    }

}
