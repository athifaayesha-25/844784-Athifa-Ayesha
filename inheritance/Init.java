class InitDemo
{ 
	int a; 
	public InitDemo(int val) 
	{
		a=val; 
		System.out.println("Value of  a:"+a); 
		}
} 
class MainClass 
{ 
	public static void main(String... args)
	{
		new InitDemo();
		}
	}



/* Out put: compile time error */