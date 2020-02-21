import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=date.plusDays(2);
		System.out.println("Today date: "+date);
		System.out.println("Yesterday date: "+yesterday);
		System.out.println("tomorrow date: "+tomorrow);

	}

}
