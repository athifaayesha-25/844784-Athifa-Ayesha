import java.util.Calendar;

//import java.util.Calendar;

//import java.time.Year;

/*import java.time.LocalDate;
import java.time.Year;*/

//import java.time.Clock;

//import java.time.MonthDay;

/*import java.time.LocalDate;
import java.time.MonthDay;*/

public class MonthDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MonthDay month=MonthDay.now();
		LocalDate date=month.atYear(2010);
		System.out.println(date);*/
		
		/*MonthDay month=MonthDay.now();
		boolean b=month.isValidYear(2010);
		System.out.println(b);*/
		
		/*Clock c=Clock.systemDefaultZone();
		System.out.println(c.getZone());*/
		
		/*Year year=Year.of(2020);
		LocalDate l=year.atDay(156);
		System.out.println(l);*/
		
		/*Year year=Year.of(2017);
		System.out.println(year.length());*/
		
		/*Calendar calendar=Calendar.getInstance();
		System.out.println("the current date is: "+calendar.getTime());
		calendar.add(calendar.DATE, 18);;
		System.out.println("18 days ago: "+calendar.getTime());
		calendar.add(calendar.MONTH, 6);
		System.out.println("6 months later: "+calendar.getTime());
		calendar.add(calendar.YEAR, 7);
		System.out.println("7 years later: "+calendar.getTime());*/
		
		Calendar calendar=Calendar.getInstance();
		System.out.println("at present calendar's YEAR: "+calendar.get(calendar.YEAR));
		System.out.println("at present calendar's Day: "+calendar.get(calendar.DATE));
		
		

	}

}
