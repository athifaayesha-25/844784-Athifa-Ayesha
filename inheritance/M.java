class Employee{ 
String empId; 
Employee(String empId){ 
this.empId=empId; 
System.out.println(this.empId); 
}
 }
 class Manager extends Employee{ 
int salary;
 Manager(String name, int salary)
{ 
this.salary=salary; 
System.out.println(this.salary);
 }
 }
class M{
 public static void main(String [] args){ 
Manager manager=new Manager(); 
}
 }



/* Output: Compile time error */