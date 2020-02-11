import java.util.*;
class Biggest{
	public static int display(int n,int[] n1)
	{
	int max=0;
	for(int i=0;i<n1.length;i++)
	{
	if(n1[i]>max)
	{
	max=n1[i];
	}
	}
	return max;
	}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
{
System.out.println("enter the size of array");
int n=sc.nextInt();
int n1[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
{
n1[i]=sc.nextInt();
}
System.out.println("Biggest value in the array :"+ display(n,n1));


}
}
}