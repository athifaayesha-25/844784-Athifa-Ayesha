import java.util.*;
class StringsPro6
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int m=s1.length();
		int n=s2.length();
		if(m==n)
		{
			for(int i=0;i<m;i++)
			{
				if(s1.charAt(i)=='-'&& s2.charAt(i)=='-')
				{
					flag=1;
					
				}
			}
			if(flag==1)
				System.out.println("True");

		}
		else
		{
			System.out.println("False");
		}
	}
}