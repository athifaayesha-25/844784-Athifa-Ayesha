import java.util.*;
class ArrayMul { 
      
     
    static void pairwiseMul(int arr[], int n) 
    { 
        int mul = 1; 
        for (int i = 0; i + 1 < n; i++)  
        { 
            
            mul = arr[i] * arr[i + 1]; 
}
            System.out.print("product of two neighboring : "+ mul + " "); 
         
    } 
      
    
    public static void main(String[] args) 
    {      
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of Array");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter Array elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}


        
        pairwiseMul(arr, n); 
    } 
} 