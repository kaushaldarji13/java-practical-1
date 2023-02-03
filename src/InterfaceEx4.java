class P{
    P(){
        System.out.println(this.hashCode());
    }
}
class c extends P{
    c(){
        System.out.println(this.hashCode());
    }
}
public class InterfaceEx4 {
    public static void main(String[] args) {
        c c = new c();
        System.out.println(c.hashCode());
    }
}
