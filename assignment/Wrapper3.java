import java.util.*;
class Wrapper3{
  
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
for(int i=0;i<n1.length;i++)
{
if(i%2==0){
n1[i]=n1[i]+1;

}
else
{
n1[i]=n1[i]-1;

}
System.out.print(n1[i]+" ");
}
}
}