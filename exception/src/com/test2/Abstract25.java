package com.test2;
abstract class dum1{
	void check(){
		System.out.println("Abstract class contains Only concrete method");
	}
}
abstract class shopping1{
	//concrete method or non abstract method
	void feedback(){
		System.out.println("*****");
	}
	//abstract method cannot have body
	abstract void additem();
	abstract void delitem();
}
/*When an abstract class is subclassed,the subclass usuallt provides implementations for all of 
 * the abstract methods in its parent class.however,if it is does not,the subclass must also be
 * declared abstract
 */
abstract class flipkart extends shopping1{
	void additem()
	{
		System.out.println("Flipkart-Item added");
	}
	
}
class amazon extends shopping1{
	void additem(){
		System.out.println("Amazon-Item added");
	}


	
	void delitem() {
		// TODO Auto-generated method stub
		System.out.println("Amazon-Item Deleted");
		
	}
}
public class Abstract25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//shopping a1=new shopping();//no object
		//flipkart f1=new flipkart();//no object
		amazon a1=new amazon();
		a1.additem();
		a1.delitem();
		a1.feedback();
		

	}

}
