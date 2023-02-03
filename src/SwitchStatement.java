public class SwitchStatement {
    public static void main(String args[]){
        int x = 10;
        final int y = 20;
        switch (x){
//            System.out.println("Hello");
            case 10:
                System.out.println(10);
                break;
            case y:
                System.out.println(20);
                break;
        }

        switch (x+1){
            case 10:
                System.out.println(10);
                break;
            case 10+20+30:
                System.out.println(60);
                break;
        }
    }
}
