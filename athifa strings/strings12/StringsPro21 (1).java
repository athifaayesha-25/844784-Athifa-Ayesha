import java.util.*;
class StringsPro21
{
	public static void main(String args[])
	{	
		int c=0;
		//String t ="";
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		/*char ch[]=s.toCharArray();
		Arrays.sort(ch);*/
		//int n=sc.nextInt();
		String t="";
		//String s1=new String(ch);
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				c++;
			}
			if(c==2)
			{
			}
			else
			{
				t=t+s.charAt(i);
			}			
		}
		System.out.println(t);
		
	}
}