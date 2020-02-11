
import java.util.*;
class TaxCalculator
{
	float tax;
	float basicSalary;
	boolean citizenship=true;
	int netSalary;
	
	public void calculateTax()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Salary of an Employee");
		basicSalary=sc.nextFloat();
		
		tax=(30*basicSalary)/100;
		System.out.println("The Tax of the employee for the::" +basicSalary+" Tax--->"+tax);
	}
	public void deductTax()
	{
		netSalary=(int)(basicSalary-tax);
		System.out.println("The net salary of the employee::"+netSalary);
	}
	public boolean validateSalary()
	{
		if(basicSalary>100000 && citizenship==true)
		{
			return true;
		}
		else{
			return false;
		}
	}
}
class CoreJavapro1
{
	public static void main(String args[])
	{
		
		TaxCalculator tc=new TaxCalculator();
		tc.calculateTax();
		tc.deductTax();
		boolean b=tc.validateSalary();
		System.out.println(b);
	}
}




