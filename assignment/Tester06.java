public class Tester06 
{
	public static void main(String[] args) { 
		int x = 0, y = 0; 
		if ((y == x++) | (x < ++y)) { 
			++y;
			
			}
		System.out.println(x + "," + y);
		} 
	}


/* Output: 
   			X-value: 1,Y-value: 2
*/