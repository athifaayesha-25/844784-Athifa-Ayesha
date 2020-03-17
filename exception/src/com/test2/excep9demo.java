package com.test2;
/*user-defined exception classes can either inherit from Throwable class or more correctly
 inherit from Exception class
 */
//class calcexception extends Throwable
class calcexception extends Exception{
	public String toString(){
		return "UserException caught:The sum of the numbers exceeds 20....";
	}
}


public class excep9demo {
	static void calculate(int a,int b) throws calcexception
	{
		int sum;
		System.out.println("Calculate Method(" + a + " ," + b + ")");
		sum=a+b;
		if(sum>20)
		{
			throw new calcexception();
		}
		System.out.println("The value of the sum of two numbers is :" +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			calculate(12,1);
			calculate(15,7);
		}
		catch(calcexception obj){
			System.out.println("Caught: " +obj);
			System.out.println("Caught: " +obj.toString());
		}

	}

}
