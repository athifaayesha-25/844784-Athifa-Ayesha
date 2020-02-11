import java.util.Scanner;
class countnew{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0,count=0;
int n=sc.nextInt();
for(int i=0;i<n;i++){
int a=sc.nextInt();
sum=sum+a;
count++;
if(sum>=n){
break;
}
}
System.out.println("The number of count" +count);
}}
