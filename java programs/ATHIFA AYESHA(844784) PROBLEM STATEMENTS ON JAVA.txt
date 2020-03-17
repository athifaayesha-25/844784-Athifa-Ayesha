                                       PROBLEM STATEMENTS ON JAVA:





1)BILL NO AND DATE

import java.util.Scanner;
class Problem1
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int bill=sc.nextInt();
 int date=sc.nextInt();
 int m=bill%10;
 int n=bill%10;
 if(((date>0 && date<=31) && (bill%date==0))||((date>0 && date<=31) && (m==date)) || ((date>0 && date<=31) && (n==date)))
 {
  System.out.println("lucky customer");
 }
 else
 {
  System.out.println("not a lucky customer");
 }
 }
}



2)OFFERS

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


3)CHOCOLATES AND CHILDREN

import java.util.Scanner;
class Problem3{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int chocolate=sc.nextInt();
 int children=sc.nextInt();
 for(int i=1;i<=children;i++){
if(chocolate>=i){
chocolate=chocolate-i;
}
else{
int n=(children-(i-1));
System.out.println("remaining chocolate:" +chocolate);
System.out.println("children remaining:" +n);
break;
}
}
}
}


4)WATERMELON

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


  