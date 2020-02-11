public class Tester25
{
	 static int x = 4; 
	 int y;
	 Tester() {
	}
	 public Tester25(int a,int b) 
	 {
		 this.x=a;
		 this.y=b; 
		 System.out.println("Value of  x :"+this.x); 
		 System.out.println("Value of  y :"+this.y); 
		 
		 }
	 public static void testMethod()
	 {
		 System.out.print(this.x);  
		 }
	 public static void main(String... args) 
	 { 
		 new Tester25(5,10); 
		 Test mytest=new Tester25();
		 Mytest.testMethod();
		 }
	 } 
/* Output: 	
   		Compile time error:
   		hint : Cannot use this in a static context
			parent class can't refer to the child class 
   		
   		**/