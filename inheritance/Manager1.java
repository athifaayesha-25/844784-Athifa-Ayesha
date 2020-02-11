import java.util.*;
class Employee{
   //Overridden method
   public void salary()
   {
Scanner sc=new Scanner(System.in);
double f;
int b=sc.nextInt();
f = 10/100*b;
      System.out.println("employee salary "+f);
   }
}
class Manager1 extends Employee{
   //Overriding method
   public void salary(){
//double f;
//int b=sc.nextInt();
//f = 10/100*b;
      System.out.println("manager salary "+f);
     
   }
   public static void main( String args[]) {
      Manager obj = new Manager();
      //This will call the child class version of eat()
      obj.salary();
   }
}