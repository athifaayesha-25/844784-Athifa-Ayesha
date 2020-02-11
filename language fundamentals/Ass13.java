import java.util.Scanner;
public class Ass13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] n1=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
        	n1[i]=sc.nextInt();
        }
        System.out.println("Searching element");
        int n2=sc.nextInt();
        for(int i=0;i<n1.length;i++) {
        if(n1[i]==n2)
        {
        	System.out.println("found");
        }
        
        if(n1[i]!=n2)
        {
        	System.out.println("not found");
        }
        	
    }
    }
}