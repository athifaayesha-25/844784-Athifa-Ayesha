import java.util.*;
class Inheritence3{
public static int calculateSalary(int salary,int basicSalary,int specialAllowance,int hra)
{
salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
return salary;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int salary=0;
System.out.println("Enter basic salary");
int basicSalary=sc.nextInt();
System.out.println("Enter  specialAllowance");
int  specialAllowance=sc.nextInt();
System.out.println("Enter Hra");
int hra=sc.nextInt();
System.out.println("final salary of employee is : "+calculateSalary(salary, basicSalary,specialAllowance,hra));
}}

