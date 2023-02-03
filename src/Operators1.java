public class Operators1 {
    public static void main(String args[]){
        int x = 10;
        int y = ++x;
//        int z = ++(++x);

        char ch = 'a';
        ch++;

        double d = 10.5;
        d++;


        //Incremental operators are not applicable for boolean

       /* boolean b = true;
        b++;
        System.out.println(b);*/

        byte a= 10;
        byte b= 20;
        byte c= (byte) (a+b);


        System.out.println(y);
        System.out.println(ch);
        System.out.println(d);
        System.out.println(c);
        System.out.println(10/0.0);
        System.out.println(-10/0.0);
//        System.out.println(0/0);
        System.out.println(0.0/0);
        System.out.println(-0.0/0);

        System.out.println(10 < Float.NaN);
        System.out.println(10 <= Float.NaN);
        System.out.println(10 >= Float.NaN);
        System.out.println(10 > Float.NaN);
        System.out.println(10 == Float.NaN);
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(10 != Float.NaN);
        System.out.println(Float.NaN != Float.NaN);

    }
}
