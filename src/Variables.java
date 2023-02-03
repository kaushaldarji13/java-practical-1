public class Variables {

    int a=10;
    static int b=20;
    public void add(){
        int c=30,d;
        d= a+b+c;
        System.out.println(d);
    }

    public void mul(){
        int e=40,f;
        f=a*b*e;
        System.out.println(f);
    }
    public static void main(String args[]){
       Variables obj = new Variables();
        obj.mul();
        obj.add();
        System.out.println(b);

    }
}


