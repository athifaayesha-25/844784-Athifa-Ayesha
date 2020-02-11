import java.util.*;
public class Ass4{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if((n1>n2)&&(n1>n3))
{
System.out.println("Large: "+n1);
}
else if((n2>n1)&&(n2>n3))
{
System.out.println("Large: "+n2);
}
else
{
System.out.println("Large: "+n3);
}
if(n1>n2&&n2>n3){
System.out.println("Second Large: "+n2);}
else if(n2>n3&&n3>n1){
System.out.println("Second Large: "+n3);}
else
System.out.println("Second Large: "+n1);
}
}