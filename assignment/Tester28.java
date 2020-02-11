public class Tester28
{
	 public static void goLoop(int a)
	 {
		 start: 
			 for (int i = 1; i < 2; i++)
			 {
				 for (int j = 1; j < 2; j++) 
				 {
					 if (a > 5) 
					 {
						 break start;
						 } 
	 System.out.print(i + j); 
	 }
				 }
	 }
	 public static void main(String args[])
	 {
		 Tester.goLoop(15);
		 System.out.println("hh");
		 }
	 } 
/* Output: 	
   	
   	no error in compile and run.....no output 		
   		**/