class A 
{

	private void printName(){

	System.out.println("Value-A");
	}

}
class B extends A
{
	
	
	 public void printName(){
		
	System.out.println("Name-B");
	}

}
public class Testt
{
	public static void main (String[] args) 
	{ 
		B b = new B();	
		b.printName();//op-->Name-B

	}
}

/*public class Testt
 {
	 int x = 12;
	static Testt reset( Testt obj) 
	{ 
		obj = null;

		return obj;

	}
	public static void main(String[] args)
	 {
		 Testt o1 = new Testt();

		o1 = reset(o1); 
		System.out.print(o1.x);//java.lang.NullPointerException

	}

}*/
/*class Plant {
 Plant() {

System.out.println("Plant created");

}

}

class Tree extends Plant { Tree() {

System.out.println("Tree created"); super();

}

}
public class Testt {

public static void main(String args[]) { Tree tree = new Tree();

}*/


/*class Base 
{
	 Base() {System.out.print("Base");}
}
public class Derived extends Base {

	public Derived() 
	{
		System.out.print("Derived");
	} 

	public static void main(String[] args) {

	new Derived(); // output -Base Derived

	}
}*/

/*class Employee
{ 
	String empId;

	Employee(String empId)
	{
	 this.empId=empId;

	System.out.println("Name : "+ this.empId);

	}

}

class Manager extends Employee
{ 
	int salary;

	Manager(String name, int salary)
	{ 
	this.salary=salary;

	System.out.println("Salary : "+ this.salary);

	}

}
class Testt{
public static void main(String [] args)
{ 
	Manager manager=new Manager();// constructor Manager in class Manager cannot be applied to given types;

}

}*/

/*interface Colorable
{
}
 class Vehicle 
{
}

class Car extends Vehicle implements Colorable 
{
} 
public class Testt {

	public static void main(String[] args)
	 { 
		Vehicle a = new Car();

		Colorable i = (Colorable) a;
		 Vehicle b = new Vehicle();
		 Colorable j = (Colorable) b; //java.lang.ClassCastException: Vehicle cannot be cast to Colorable

	}

}*/

/*interface Colorable
{
 }

interface Bouncable extends Colorable 
{
} 
class Super implements Bouncable 
{
 }

class Sub extends Super implements Bouncable
 {
 } 
class Individual 
{
 }

public class Testt
{

public static void main(String[] args)
 { 
	System.out.print(new Sub() instanceof Super); //Super s=new Sub();--->True
	System.out.print(new Sub() instanceof Colorable);//Colorable c=new Sub();-->True
	System.out.print(new Super() instanceof Sub); //Sub s1=new Super();-->False
	//System.out.print(new Individual() instanceof Super);//Super s2=new Individual();-->False

}

}*/

