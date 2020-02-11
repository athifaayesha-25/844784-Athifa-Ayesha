import java.util.*;
public class Ass9{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
int rem=0;
int val=0;
while(n>0)
{
rem=n%10;
val=val*10+rem;
n=n/10;
}
System.out.println("reverse of the number: "+val);}
}