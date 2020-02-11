public class Tester22
{
	  static boolean isEven(int x)
	 {
		 return (x % 2 == 0) ? true : false; 
		 }
	 public static void main(String[] args)
	 { 
		 System.out.print(isEven(2)); 
		 System.out.print(isEven(3));
		 System.out.print(isEven(4)); 
		 }
	 } 


/* Output: 	
   		compile time error
   		 use static before boolean isEven()
   		
   		**/