public class Variables3 {
  static int x =10;
  static int y;
  static double z;
  static boolean b;
  static String s;


    public static void main(String[] args){
      Variables3 v3 = new Variables3();
      System.out.println("with the reference of obj" +v3.x);
      System.out.println("with the reference of class" +Variables3.x);
      System.out.println("access directly " +x);
      System.out.println(y);
      System.out.println(z);
      System.out.println(b);
      System.out.println(s);

    }
    public void s(){
      System.out.println("accessed in instance area" +x);
    }



}
