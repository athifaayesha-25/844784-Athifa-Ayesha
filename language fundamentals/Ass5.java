import java.util.*;
public class Ass5{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter name ");
String s=sc.next();
System.out.println("Enter marks ");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int sum=n1+n2+n3;
float avg=sum/3;

System.out.println("Sum: "+sum);
System.out.println("Avg: "+avg);
if(avg>90)
{
System.out.println("First Class");
}
else if(avg>70)
{
System.out.println("Second Class");
}
else if(avg>35)
{
System.out.println("Pass");
}
else 
System.out.println("Fail");

}
}