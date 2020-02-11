import java.util.Scanner;
class Problem2{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int product1=sc.nextInt();
int product2=sc.nextInt();
int product3=sc.nextInt();

int pp=0;
if(product1<product2){
if(product1<product3){
pp=product1;
}
}
else if(product2<product3){
pp=product2;}
else{
pp=product3;
}
System.out.println("least product value " +pp);
int ad=product1+product2+product3;
double offer1=ad-(ad+0.2);
int offer2=ad-pp;
System.out.println("total amount with 20% discount " +offer1);
System.out.println("total amount with 20% discount " +offer2);
if(offer1>offer2)
{
System.out.println("go for offer 1");
}
else
{
 System.out.println("go for offer 2");
}
}
}