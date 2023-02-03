import java.nio.Buffer;
import java.util.Scanner;
import java.util.Scanner.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for check palindrome");
        String a=sc.next();



        StringBuffer sb = new StringBuffer(a);
//        System.out.println(sb.reverse())
        sb.reverse();
        String rev = sb.toString();
        if (a.equals(rev)){
            System.out.println("given string is palindrome");
        }
        else {
            System.out.println("given string is not palindrome");
        }



    }
}
