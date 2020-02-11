import java.util.*;
public class Ass11{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
System.out.println("Series is...");
for(int i=1;i<=n;i++){

if(i%2==0){
System.out.print(" -"+i);
}
else
{
System.out.print(" "+i);
}
}
}}

