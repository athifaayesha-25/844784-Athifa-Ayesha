import java.util.*;
class Wrapper2{
  
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
int min;
System.out.println("enter elements");
int[] n1=new int[n];
for(int i=0;i<n;i++)
{
n1[i]=sc.nextInt();
}

int sum=0;
for(int i=0;i<n1.length;i++)
{
sum=sum+n1[i];
}
System.out.println("Sum of the values in the array: "+sum);

}
}
   