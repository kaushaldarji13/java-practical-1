class Student{

}
class Customer{

}

public class NewInstance  {
    public static void main(String[] var0) throws Exception {
            Object var1 = Class.forName(var0[0]).newInstance();
            System.out.println("Object created for: " + var1.getClass().getName());
    }
}

