package com.test2;

public class excep7 {
	static void throwExcp() throws IllegalAccessException
	{
		try
		{
			throw new IllegalAccessException("Going to method catch block");//exception thrown
		}
		//exception caught
		catch(IllegalAccessException e)
		{
			System.out.println("catch block");
			System.out.println("Msg: "+e);
			throw new IllegalAccessException("Going to main method");
			//exception thrown again
	     
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throwExcp();
		}
		catch(Exception e)
		{
			System.out.println("exception caught: "+e);
		}

	}

}
