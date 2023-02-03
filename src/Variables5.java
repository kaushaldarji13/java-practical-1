public class Variables5 {
    public static void main(String args []){
        int i = 0;
        for (int j=0; j<3;j++){
            i=i+j;

        }
        //we can't use local variable from outside the for loop
        //System.out.println(i+" "+j );
        int x;
        // for the use of local variable we have to initialize the variable first
        //System.out.println(x);
    }
}
