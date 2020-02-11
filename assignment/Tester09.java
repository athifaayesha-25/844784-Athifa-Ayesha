public class Tester09
{
	public static void main(String[] args)
	{
		int j = 10; 
		switch (1)
		{ 
	case 20: j += 1; 
	case 40: j += 2;
	default: j += 3; 
	case 0: j += 4; 
	}
		System.out.print(j);
		}
	}


/* Output: 	
   		j-value :10
*/