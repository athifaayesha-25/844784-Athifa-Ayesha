class Plant 
{
 	Plant() 
	{ 
		System.out.println("Plant created"); 
	}
 } 
class Tree extends Plant 
{ 
	Tree()
 	{
super(); 
		 System.out.println("Tree created"); 
		
	}
 } 
public class Test1 
{
	 public static void main(String args[]) { 
	 Tree tree = new Tree(); 
	}
 } 


/* Output:call to super(); must be in first statement in constuctor     */