public class Tester02
{ 
	public static void main(String[] args) { 
		int x = 0, y = 0;
		x = 5 + y++; 
	System.out.println("x value :" +x + ","+"y value :" + y); 
	x = 0;
	y = 0; 
	x = 5 + ++y; 
	System.out.println("x value :"+x + ","+"y value :" + y); } 
	}



/* OutPut:     x value :5,y value :1
			   x value :6,y value :1
*/