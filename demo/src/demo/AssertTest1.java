package demo;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertTest1 {

	@Test
	public void test123() {
		String obj1="junit";
		String obj2="junit";
		String obj3=new String("test");
		String obj4="test";
		String obj5=null;
		int var1=1;
		int var2=2;
		int[] arithmetic1={1,2,3,4};
		int[] arithmetic2={1,2,3,4};
		//the assertEquals() method compares two objects for equality,
		//using their equals() method
		assertEquals(obj3,obj4);//success
		assertEquals(obj1,obj2);//success
		//check if two object references
		//point to the same object
		//assertSame(obj3,obj4);//fails
		assertSame(obj1,obj2);//success
		//check if two object references
		//not point to the same object
		assertNotSame(obj3,obj4);
		//Check that an object isn't null
		assertNotNull(obj1);
		//check that an object is null
		assertNull(obj5);
		//check that a condition is true
		assertTrue(var1<var2);
		//check that a condition is false
		assertFalse(var1>var2);
		//check whether two arrays are 
		//equal to each other
		assertArrayEquals(arithmetic1,arithmetic2);
		}

}
