public class Variables4 {
    static int x= 10;
    int y= 20;
    public static void main(String args[]){
        Variables4 v4 = new Variables4();
       v4.y=999;
       v4.x=888;

       Variables4 v = new Variables4();
        System.out.println(v.x+" "+v.y);
    }
}
