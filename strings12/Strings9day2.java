import java.util.*;
class Strings9day2
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		
		for(int i=0;i<s.length()-1;i++)
		{	
			try
			{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				int a=Integer.parseInt(s);
				if(a<0)
				System.out.println(Math.abs(a));
				break;
			}
			else if(s.charAt(i)=='@'||(s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z')||s.charAt(i)=='$')
			System.out.println("-1");
				break;}
			catch(Exception e){
				System.out.println("Num format exception");
				break;
			}		
		}

		
	}
}