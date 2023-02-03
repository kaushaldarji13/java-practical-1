
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LeaveManagement {



    private static final SimpleDateFormat  dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static Date getfromString(String holidayString){
        Date date1 = null;
        try {
            date1 = dateFormat.parse(holidayString);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        return date1;
    }


    // to check  weekend or not
    public static boolean isWeekend(final LocalDate ld)
    {
        DayOfWeek day = DayOfWeek.of(ld.get(ChronoField.DAY_OF_WEEK));
        return day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY;
    }


    public static int getWorkingDaysBetweenTwoDates(Date date1, Date ed) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(date1);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(ed);

        int workDays = 0;

        //Return 0 if start and end are the same
        if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
            return 0;
        }

        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(ed);
            endCal.setTime(date1);
        }

        do {
            //excluding start date
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                ++workDays;
            }
        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

        return workDays;
    }


    public static void main(String [] args) throws Exception{
        Date ed = new Date(07/12/2022);

        //getting no of leaves from user
        Scanner n = new Scanner(System.in);
        System.out.println("Enter no of leaves :-");
        int no =n.nextInt();

        // getting start date from user
        Date date1=null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter starting date (dd/mm/yyyy):");
        String day = input.nextLine();
        if(null != day&& day.trim().length() > 0){
            date1 = format.parse(day);
        }
        System.out.print(date1);

        //public holiday


       /* int [] dateofmonths = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int i = 0;
        if(days[i].equals("Saturday") || days[i].equals("Sunday") ){
            System.out.println();
        }*/

        //public holiday
        Date[] companyHoliday = {
                getfromString("06/06/2022"),
                getfromString("08/06/2022"),
                getfromString("09/06/2022"),};

        // check for weekend

           LocalDate today = LocalDate.now();
            System.out.println("Is weekend : " + isWeekend(today));

            LocalDate someDate = LocalDate.of(2022, 11, 28);
            System.out.println("Is weekend : " + isWeekend(someDate));






//        m1();
//        getWorkingDaysBetweenTwoDates(date1,ed);
        System.out.println( getWorkingDaysBetweenTwoDates(date1,ed));



    }

}
