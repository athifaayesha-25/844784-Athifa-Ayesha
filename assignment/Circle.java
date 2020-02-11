package com.examples.Shapes1;

public class Circle
{

	
		private float r;
		static float pi=3.5f;
			public Circle()
			{
				
				r=1.5f;
			}
		public Circle(float r)
		{
				this(r,pi);
				this.r=r;
		}
		public Circle(float r,float pi) {
			
			this.r=r;
			
			Circle.pi=pi;
		}
		public void calculateArea()
		{
			float area=pi*r*r;
			System.out.println(area);
		}
		public void calculateCircumference()
		{
			float circumference=2*pi*r;
			System.out.println(circumference);
		}
}


