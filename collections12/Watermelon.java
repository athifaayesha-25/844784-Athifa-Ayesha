import java.util.Scanner;
public class Watermelon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enetr the number");
int n=sc.nextInt();
if(n%2==0)
System.out.println("equal parts are "+n/2+" "+n/2);
else
System.out.println("cant divide");
for(int i=1;i<n;i++)
{
System.out.println(i +" "+ (n-i));
}
}
}