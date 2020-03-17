import java.util.Calendar;

//import java.util.Calendar;

//import java.time.Year;

/*import java.time.LocalDate;
import java.time.Year;*/

//import java.time.Clock;

//import java.time.MonthDay;

/*import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;*/

public class MonthDayDemo {

public static void main(String[] args) {


/*MonthDay month=MonthDay.now();
LocalDate date=month.atYear(2020);
System.out.println(date);*/

/*MonthDay month=MonthDay.now();
boolean b=month.isValidYear(162);
System.out.println(b);*/

/*Clock c=Clock.systemDefaultZone();
System.out.println(c.getZone());*/

/*Year y=Year.of(2010);
LocalDate l=y.atDay(10);
System.out.println(l);*/

/*Year year=Year.of(2020);
System.out.println(year.length());*/

/*Calendar calendar=Calendar.getInstance();
System.out.println("the current date is :"+calendar.getTime());
calendar.add(Calendar.DATE, -18);
System.out.println("18 days ago :"+calendar.getTime());
calendar.add(Calendar.MONTH, 6);
System.out.println("6 months later :"+calendar.getTime());
calendar.add(Calendar.YEAR, 7);
System.out.println("7 years later :"+calendar.getTime());*/

Calendar calendar=Calendar.getInstance();
System.out.println("at present calendar's year: "+calendar.get(Calendar.YEAR));
System.out.println("at present calendar's day: "+calendar.get(Calendar.DATE));

}

}