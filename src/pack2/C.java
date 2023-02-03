package pack2;

import pack1.ProtectedEx;

public class C extends ProtectedEx {
    public static void main(String[] args) {
        ProtectedEx a = new ProtectedEx();
//      a. m1();

        C c = new C();
        c.m1();

        ProtectedEx a1 = new ProtectedEx();
//        a1.m1();
    }
}
