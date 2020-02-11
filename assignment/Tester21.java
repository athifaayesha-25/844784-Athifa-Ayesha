public class Tester21
{
	 public static void main(String [] args)     {  
		 int x= 0;       
		 int y= 0;   
		 for (int z = 0; z < 5; z++)  
		 {           
			 if (( ++x > 2 ) && (++y > 2))   
			 {        
		 x++;          
		 }    
			 } 
		 System.out.println(x + " " + y);    
		 } 
	}


/* Output: 	
   		
   		x-value :6 , y-value :3
   		**/