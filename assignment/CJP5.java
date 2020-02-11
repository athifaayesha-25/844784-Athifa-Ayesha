import java.util.*;
/*class CJP5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}*/
class CJP5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{			
				if(j<=i)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{			
				if(j<=i)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}