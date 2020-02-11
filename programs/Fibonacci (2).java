import java.util.Scanner;
class Fibonacci{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("no of months");
int n=sc.nextInt();
int a[]=new int[12];
a[0]=0;
a[1]=1;
for(int i=2;i<n;i++)
{
a[i]=a[i-1]+a[i-2];
}
System.out.println("size of amoeba is= " +a[n-1]);
 
}
}