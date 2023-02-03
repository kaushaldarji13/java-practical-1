public class Overloading1 {
    public void m1(String s){
        System.out.println("--> String Version");
    }
   /* public void m1(Object o){
        System.out.println("--> Object Version");
    }*/
    public void m1(StringBuffer sb){
        System.out.println("--> StringBuffer Version ");
    }


    public static void main(String[] args) {
        Overloading1 o = new Overloading1();
//        o.m1(new Object()); //Object version
        o.m1("Kaushal"); // String version
//        o.m1(null);
        o.m1(new StringBuffer("Kaushal"));
    }
}
