import java.util.Scanner;
 class Problem4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int weight=sc.nextInt();
if(weight%2==0)
{

int mid=weight/2;
int number1=0;
int number2=weight;
for(int i=1;i<=mid;i++)
{
if(i==mid)
{
System.out.println("combination " +": "+mid+","+mid);
}
else
{
number1=number1+1;
number2=number2-1;
System.out.println("combination " +": "+number1+","+number2);
System.out.println("combination " +": "+number2+","+number1);
}
}
}
else
{
System.out.println("no watermelon");
}}}