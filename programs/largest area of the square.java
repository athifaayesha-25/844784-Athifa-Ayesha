
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int arr[]={2,2,2,9,2,2,2,2,2};
	    int n=arr.length;
	    int maxVal=arr.Stream(arr[]).max().getAsInt();
	    int []freq = new int[maxVal + 1]; 
         for (int i = 0; i < n; i++) 
            freq[arr[i]]++; 
	    
	   for (int i = maxVal; i > 0; i--) 
    { 
  

        if (freq[i] >= 4)  
        { 
            System.out.print("Area = " +  
                            (Math.pow(i, 2))); 
            System.out.print("\nCount = " +  
                            (freq[i] / 4)); 
            return; 
        } 
    } 
  
    
    System.out.print("-1"); 
} 
}

	    
	    
	    
	
		    
		    
	

    	

		        
		    
		    
		        
		   
		
		
	

