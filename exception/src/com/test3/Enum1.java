package com.test3;
//to define our own datatypes
/*
 * --Enum declaration can be done outside a class
 * or inside a Class but not inside a Method.
 * --enum constant is always implicitely
 * public static final.Since it is static,
 * we can access it by using enum Name
 * --enum cannot be used to create objects,
 * and it cannot extend other classes
 */
enum dept{
	Insurance,Training,Pitstop,Network;
	String display()
	{
		String msg="You are working in " +
	this+ " dept";
		System.out.println("Inside Enum: "+msg);
		return msg;
	}
}
public class Enum1 {
	enum month
	{
		January,February,March,April
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enum: "+dept.Insurance);//enumname.constant
		dept c1[]=dept.values();
		for(dept j1:c1)
		{
			System.out.println("Dept Datatypes: "+j1);
		}
		System.out.println("Enum method: "+dept.Pitstop.display());
		month m1;
		m1=month.January;
		switch(m1)
		{
		case February:
			System.out.println("Warm");
			break;
		case January:
			System.out.println("Winter");
			break;
			default:
				System.out.println("I don't know");
				break;
		}
		final String name="Athifa";
		//name="devi";//cannot be altered
		System.out.println(name);

	}

}
