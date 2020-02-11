import java.util.*;
class Strings10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<=ch.length-2;i++)
		{
			if(ch[i]==ch[i+1])
			{
			}
			else
			{
				System.out.println(ch[i]);
			}
		}
		System.out.println(ch[ch.length-1]);
	}
}