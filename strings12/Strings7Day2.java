import java.util.*;
class Strings7Day2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int k=0,c=0;
		char[] vowel=new char[100];
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.contentEquals(sb))
		{
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')	
				{
					vowel[i]=s.charAt(i);
					Arrays.sort(vowel);
					for(k=0;k<vowel.length-1;k++)
					{
						if(vowel[k]==vowel[k+1])
						{
							c++;
							
						}
						else
						{
							c++;
							if(c==2)
							break;
						}
					
					}
				}
			}
		}
		if(c>=2){
			System.out.println("True");}
		else{
			System.out.println("False");}
		
	}
}