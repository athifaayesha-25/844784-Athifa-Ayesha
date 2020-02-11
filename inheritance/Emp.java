import java.util.*;
class Emp
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int[] no=new int[n];
System.out.print("enter employee numbers");
for(int i=0;i<n;i++)
{
no[i]=sc.nextInt();
}
String[] name=new String[n];
System.out.print("enter  employee names");
for(int i=0;i<n;i++)
{
name[i]=sc.next();

}
String[] dept=new String[n];
System.out.print("enter  employee Department");
for(int i=0;i<n;i++)
{
dept[i]=sc.next();
}
int[] salary=new int[n];
System.out.print("enter salary");
for(int i=0;i<n;i++)
{
salary[i]=sc.nextInt();
}
int max=0;
for(int i=0;i<salary.length;i++)
{
if(salary[i]>max)
{
max=salary[i];
}
}
System.out.println("hightest employee salary :"+max);

for(int i=0;i<no.length;i++){
System.out.print("Employee numbers :"+no[i]);
}
for(int i=0;i<name.length;i++){
System.out.print("Employee names :"+name[i]);

}
for(int i=0;i<dept.length;i++){
System.out.print("Employee departments :"+dept[i]);
}
}
}
