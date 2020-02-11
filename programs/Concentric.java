import java.util.Scanner;
class Concentric
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int num, sum=0, count, n;
    System.out.println("Enter the target score:");
    num=sc.nextInt();
    System.out.println("Enter the scores taken by Patrick in each turn:");
    for(count=0;sum<num;count++)
    {
        n=sc.nextInt();
        sum=sum+n; 
    }
    System.out.println("the no of turns is= " +count);
 }
}