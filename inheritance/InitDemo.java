class InitDemo 
{
	static int i=demo(); 
	static 
	{
		System.out.println(i); 
		} 
	InitDemo() 
	{
		System.out.println("hello 1"); 
	} 
	public static void main(String... args) {
 System.out.println("Hello 2"); 
 }
	static int demo() 
 { 
	 System.out.println("Inside Demo"); 
	 return 10; 
	 }
 }


/* Output:	Inside Demo
			10
			Hello 2    */