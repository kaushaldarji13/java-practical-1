public class ShortCircuitOperators {
    public static void main(String args[]){
        int x=10, y=15;
        if (++x < 10 || ++y >15){
            x++;
        }
        else {
            y++;
        }
        System.out.println(x+ " "+y);

        if (++x < 10 && x/0 >15){
            System.out.println("hello");
        }
        else {
            System.out.println("hi");
        }

    }

}
