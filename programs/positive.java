/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i=1,b,count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of n");
	    n=sc.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        System.out.println("enter the number");
	        b=sc.nextInt();
	        if(b>=0)
	         count++;
	        
	    }
	    System.out.println("number of positive numbers entered is= " +count);
	}
}

	    
	    
	    
	
		    
		    
	

    	

		        
		    
		    
		        
		   
		
		
	

