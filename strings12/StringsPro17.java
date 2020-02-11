import java.util.*;

class StringsPro17
{
	
	public static void main(String args[])
	{
		int m;
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int n=sc.nextInt();
		String s4=s1.substring(5,s1.length());
		String s5=s2.substring(5,s2.length());
		int a= Integer.parseInt(s4);
		int b= Integer.parseInt(s5);
			m=Math.abs((b-a)*n);
			
			System.out.println(m);
		
	}
}
		