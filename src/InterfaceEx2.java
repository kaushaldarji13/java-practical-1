
interface Upper{
    int x = 777;
}
interface Lower{
    int x = 888;
}
public class InterfaceEx2 implements Upper,Lower{
    public static void main(String[] args) {

//        System.out.println(x);
        System.out.println(Upper.x);
        System.out.println(Lower.x);
    }
}
