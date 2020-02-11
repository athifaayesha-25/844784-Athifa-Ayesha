import java.util.Scanner;
public class Ass14
{
	public static int fact(int n) {
 	   if(n==0) {
 		   return 1;
 	   }
 	   else
 	   {
 		   return (n*fact(n-1));
 	   }
	}
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int f=0;
        f=fact(n);
        	System.out.println("Factorial of the number using recursion :"+f);
    }
}