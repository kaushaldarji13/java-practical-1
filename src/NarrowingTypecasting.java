public class NarrowingTypecasting {
    public static void main(String[] args){
        float f=34.24355f;
        int i = 10;


        int a=(int)f;
        float d=(float)i;
        double e=(double)f;


        System.out.println("int value of "+f+" is = "+a); //float to int
        System.out.println("float value of "+i+" is = "+d); // int ot float
        System.out.println("double value of "+i+" is = "+e); // float to double

    }
}
