import java.util.*;
class StringsPro13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				if(i==2||i==5||i==9){
				t=t+"-";}
				t=t+s.charAt(i);
				
			}
		}
		System.out.println(t);
	}
}