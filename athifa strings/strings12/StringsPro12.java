import java.util.*;
class StringsPro12
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='z')
			{
				t=t+"a";
			}
			else
			t=t+(char)(s.charAt(i)+1);
			

		}
		System.out.println(t);
	}
}