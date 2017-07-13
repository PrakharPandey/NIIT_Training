import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

public class JunitFour {
Unit u;

@Before
public void setUp()
{
	System.out.println("Setting Up");
	u=new Unit();
}

@BeforeClass
public static void bfour()
{
	System.out.println("This is used to allocate resources or establish database connectivity before the test cases are executed");
}

@Test//(expected=Exception.class)
public void testFirst()
{
	Assert.assertEquals(String.class, u.getMessage("abc").getClass());
}

@After
public void teardown()
{
	System.out.println("Releasing");
	u=null;
}

@AfterClass
public static void aftr()
{
	System.out.println("This is used to free resources after the test cases are executed");
}

@Ignore
public void prnt()
{
	System.out.println("this test case will be ignored");
}

@Test(timeout=1)
public void prntng() throws InterruptedException
{
	//wait(2);    //now it will not print as time has passed
	System.out.println("this test case will be printed within specified milliseconds");

}
}