
import java.util.Scanner;
public class Main
{
    static int numberOfBishops(int n) 
{ 
    if (n < 1) 
        return 0; 
    else if (n == 1) 
        return 1; 
    else
        return 2 * (n - 1); 
} 
	public static void main(String[] args) {
		 int n = 5;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
    System.out.println(numberOfBishops(n)); 
	}
}
