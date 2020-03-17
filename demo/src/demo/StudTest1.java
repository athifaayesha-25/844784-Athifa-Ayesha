package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudTest1 {
	Student s1=new Student();

	@Test
	public void test() {
		s1.setSid(1001);
		s1.setName("Thananya");
		//expectedresult,actualresult
		assertEquals(1001,s1.getSid());
		assertEquals("Thananya",s1.getName());
	}

}
