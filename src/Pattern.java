public class Pattern {
    public static void main(String[] args) {
        int rows=7;
//inner loop
        for (int i= rows; i>=1 ; i--)
        {
//outer loop
            for (int j=1; j<=i; j++)
            {
//prints star and space
                System.out.print("* ");
            }
//throws the cursor in the next line after printing each line
            System.out.println();
        }
    }

}
