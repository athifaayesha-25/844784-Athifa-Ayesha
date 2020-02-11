public class Tester05 
{
	public static void main(String[] args) 
	{
		int x = 0;
		int y = 0; 
		if ((true & false) | (true & false) & x++>0)
			System.out.print("stmt1 ");
		if (false || true | (++y> 0 | y++>0))
			System.out.println("stmt2 "); 
			System.out.println(x+" "+y); 
		}
	} 


/* Output:  stmt2 
   			X-value: 1,Y-value: 2
*/