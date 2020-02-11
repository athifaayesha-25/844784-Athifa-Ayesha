import java.util.Scanner;
class Printvalues
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
System.out.println("enter the value of a");
int a=sc.nextInt();
System.out.println("enter the value of b");
int b=sc.nextInt();
if(a>=b)
{
for(i=a;i>=b;i--)
{
System.out.println("i");
}
}
if(a<=b)
{
for(i=a;i<=b;i++)
{
System.out.println(+i);
}
}
}
}