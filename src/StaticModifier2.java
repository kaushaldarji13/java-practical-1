public class StaticModifier2 {
    public static void main(String[] args) {
        System.out.println("Parent method");
    }
}
class C extends StaticModifier{
    public static void main(String[] args) {
        System.out.println("Child Main");
    }

}
