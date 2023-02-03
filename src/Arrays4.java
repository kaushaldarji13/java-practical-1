public class Arrays4 {
    public static void main(String [] args){
         int [] a= {10,20,30,40};
         char[] b = {'a','e','i','o','u'};
         String [] c = {"hi","good","morning"};

         String d = "Kaushal";

        System.out.println(d.length());

        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);


        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

        for (int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }

        for (int i=0; i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
