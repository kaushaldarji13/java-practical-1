import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateFunction {
    public static void main(String[] args) throws ParseException {
        Date date1=null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter starting date (dd/mm/yyyy):");
        String day = input.nextLine();
        if(null != day&& day.trim().length() > 0){
            date1 = format.parse(day);
        }

        System.out.print(date1);
    }
}
