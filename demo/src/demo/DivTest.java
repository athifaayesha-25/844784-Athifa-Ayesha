package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {
	Division obj1=new Division(10,2);
	Division obj2=new Division(10,0);

	@Test
	public void test() {
		System.out.println("First test case");
		assertEquals(5,obj1.division());
	}
	@Test(expected=ArithmeticException.class)
	public void test1()
	{
		System.out.println("Second test case");
		assertEquals(5,obj2.division());
	}
	@Test(expected=ArithmeticException.class)
	public void ArithExcep2()
	{
		throw new NullPointerException();
	}

}
