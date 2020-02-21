import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Date date=new Date();
    SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
    String strDate=formatter.format(date);
    System.out.println("date format with MM/dd/yyyy HH:mm:ss");
    strDate=formatter.format(date);
    formatter=new SimpleDateFormat("E,dd MMMM yyyy HH:mm:ss Z");
    strDate=formatter.format(date);
    System.out.println("date format with E,dd MMMM yyyy HH:mm:ss Z:" +strDate);
	}

}
