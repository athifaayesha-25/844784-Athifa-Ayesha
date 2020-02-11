package com.examples.Shapes1;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(5.2f);
		Circle c2=new Circle(6.2f,3.6f);
		c1.calculateArea();
		c1.calculateCircumference();
		c2.calculateArea();
		c2.calculateCircumference();
	}

}
