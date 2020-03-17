package com.test2;

public class excep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,a;
		try{
			d=0;
			a=42/d;
			System.out.println("\n\t The result is "+a);
		}
		catch(Throwable e)
		//catch(Exception e)
		//catch(ArithmeticException e)
		{
			System.out.println("\n\t Division by zero");
			System.out.println("\n\t Exception: "+e);
			System.out.println("\n\t Exception: "+e.getMessage());
			e.printStackTrace();//directly send to console window
		}
		//code enclosed within a finally block will always be executed(whether or not an exception
		//occcurs)
		finally{
			System.out.println("\n\t After catch statement");
		}
		System.out.println("progress continues......");
		}

	}


