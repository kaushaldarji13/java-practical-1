public class Factorial {
    public static void main(String args[]){
        int i, n = 10;
        for(i =2;i <= n;i++) {
            if (i == 0 && i == 1) {
                System.out.println("factorial of number is not possible");
            }
            else {
                System.out.println("Factorial of-->" + i + "  is:--" + i * (i - 1));
            }
        }
        /*System.out.println("Factorial of-->"+ i +"  is:--" +i*(i-1));
*/
    }
}
