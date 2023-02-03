public class Arrays3  {
    public static void main(String[] args){
        int [][][] x = new int[2][][];
        x[0] = new int[3][];
        x[0][0]= new int[1];
        x[0][1]= new int[2];
        x[0][2]= new int[3];

        x[1] = new int[2][2];

        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        System.out.println(x[0][0][0]);

        int [] y = new int[4];
        y[0]=10;
        y[1]=20;
        y[2]=30;
        y[3]=40;
        System.out.println(y[3]);

    }
}



