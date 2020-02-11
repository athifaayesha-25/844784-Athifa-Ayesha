import java.util.*;
import java.util.Scanner;
public class Four{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a[]=new Int(num);
for(int i=0;i<num;i++)
{
a[i]=sc.nextInt();
}
int b=0;
int get=sc.nextInt();
for(int i=0;i<num;i++){
if(a[i]==get)
{
b=-1;
System.out.println(i);
}}
if(b==0)
{
if(get<a[0])
System.out.println( "0");
}
if(get>a[num-1]){
System.out.println("num");
for(int j=1;j<num;j++){

if(get>a[i-1]&&get<a[i])
System.out.println(i);
}
}
}
}


