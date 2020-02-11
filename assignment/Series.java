import java.util.*;
class Series{
public static int calculateSum(int n,int a,int d)
{
int sum=(n/2)*(2*a + (n-1)*d);

return sum;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number value");
int n=sc.nextInt();
int a=1;
int  d=2;
System.out.println("Sum of the series....."+calculateSum(n,a,d));
}
}



