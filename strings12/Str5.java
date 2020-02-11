import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class Str5 {
public static void main(String[] args) {
String str = new String();
Scanner sc = new Scanner(System.in);
str = sc.nextLine();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1 = sdf.parse(str);
System.out.println("TRUE");
} catch (Exception e) {
System.out.println("FALSE");
}
}
}
