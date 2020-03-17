import java.util.Arrays;
import java.util.Scanner;

/*import java.util.Arrays;
import java.util.Scanner;*/

public class String6 
{
	/*static String removeDuplicates(char str[],int n)
	{
		int index=0;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
					break;
				}
								
			}
		if(j==i)
		{
			str[index++]=str[i];
		}
		}
		return String.valueOf(Arrays.copyOf(str,index));
	}*/
	
	
	static String removeDuplicates(char str[],int n)
	{
		int index=0;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
					break;
				}
			}
			if(j==i)
			{
				str[index++]=str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}
	
	
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char str[]="geeksforgeeks".toCharArray();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the input string");
		char str[]=sc.nextLine().toCharArray();
		int n=str.length;
		System.out.println(removeDuplicates(str,n));
		
		
    
	}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input String");
		char str[]=sc.nextLine().toCharArray();
		int n=str.length;
		System.out.println(removeDuplicates(str,n));
	}
}
