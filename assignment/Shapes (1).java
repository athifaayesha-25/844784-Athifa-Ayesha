package com.example.shapes;

import java.util.Scanner;

public class Circle
{
	final static float pi=3.14f;
	int r;
	public Circle(float r)
	{
		this.r=r;
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public void calculateArea()
	{
		float area = pi*r*r;
		System.out.println("The area of the circle is:"+area);
	}
}
class Triangle
{
	int l,b;
	public Triangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void calculateArea()
	{
		double area = (0.5)*l*b;
		System.out.println("The area of the triangle is:"+area);
	}
}
class Square
{
	int l1;
	public Square(int l1)
	{
		this.l1=l1;
	
	}
	public void calculateArea()
	{
		int area = l1*l1;
		System.out.println("The area of the square is:"+area);
	}
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numOfSides=sc.nextInt();
		Circle c=new Circle(4);
		Triangle t=new Triangle(3,4);
		Square s=new Square(3);
		//int ch=sc.nextInt();
		switch(numOfSides)
		{
		case 1:c.calculateArea();
				break;
		case 2:
			t.calculateArea();
				break;
		case 3:s.calculateArea();
				break;
		default:System.out.println("No shapes are present");
		
		}
	}

}
