import java.util.*;
class Wrapper1{
  
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

Arrays.sort(n1);
 min=n1[0];
System.out.println("Smallest value in the array: "+min);
}
}
   