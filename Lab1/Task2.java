package Lab1;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {
    
    public static void main (String[] args) {
       
    int inp_month, inp_year;

        Scanner in_date = new Scanner(System.in);
        System.out.print("Insert num of month: ");
        inp_month = in_date.nextInt();

        System.out.print("Insert num of year: ");
        inp_year = in_date.nextInt();
        in_date.close();

        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.MONTH, inp_month);
        calendar.set(Calendar.YEAR, inp_year);

        System.out.println("Days ih this month: ");
        
        System.out.print(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));


        }
}
