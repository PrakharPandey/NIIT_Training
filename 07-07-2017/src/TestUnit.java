

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUnit extends TestCase {           //For JUnit we extend TestCase Class
	Unit u;
	public void setUp()                          //JUnit 3 has no annotations i.i. @Before, @After, @Test, @Test(expected=Exception.class)
	{
		u=new Unit();
	}
	
	
	@Test(expected=IOException.class)
	public void testcheckeven()
	{
		boolean a=u.even(10);
		assertTrue(a);
	}
	public void negativecase()
	{
		assertTrue(!u.even(15));
	}
	public void testsum()
	{
		assertTrue(u.sum(3, 2)==5);    //or assertEquals(5, u.sum(3,2));
	}                                  
}
