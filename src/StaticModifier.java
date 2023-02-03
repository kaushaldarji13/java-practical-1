public class StaticModifier {
    static int x =10;
    int y = 20;

    public static void main(String[] args) {
        StaticModifier t1 = new StaticModifier();
        t1.x = 888;
        t1.y = 999;
        StaticModifier t2 = new StaticModifier();
        System.out.println(t2.x+"  "+t2.y);


    }
}
