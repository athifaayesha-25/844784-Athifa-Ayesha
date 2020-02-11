import java.util.*;
class SimpleInterestCalculator
{
	double simpleInterest;
	/*public SimpleInterestCalculator(double simpleInterest,double principal)
	{
		this.simpleInterest =  simpleInterest;
		this.principal = principal;
	}*/
	public double calculateSimpleInterest()
	{
		if(p>100000)
			{
			if(y>10)
			simpleInterest=p*y*10/100;
			else
			simpleInterest=p*y*9.5/100;
			}
			
			else
			{
				if(y>10)
				simpleInterest=p*y*5/100;
				else 
				simpleInterest=p*y*4.5/100;
		
			}

	return simpleInterest;
	}
	
}
class CJP4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p;
		int y;
		SimpleInterestCalculator s=new SimpleInterestCalculator();
		System.out.println("Enter principal");
		p=sc.nextDouble();
		System.out.println("Enter years");
		y=sc.nextInt();
		double s1=s.calculateSimpleInterest(p,y);
		System.out.println(s1);
	}
}
	