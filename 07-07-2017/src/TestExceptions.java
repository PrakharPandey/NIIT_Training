

public class TestExceptions {                        //Testing Runtime no throws required
public static void main(String[] args)
{
	
	int aa[]={1,2,3,4,5};
		try(TestAutoCloseable t=new TestAutoCloseable()){     //Implementing Autocloseable

	
  System.out.println(aa[100]);
  
}
	catch(Exception e)
	{
		
		throw new TestRuntime("Custom Exception");

		
	}
	//	finally
	//	{
	//		System.out.println("Finally Block");
	//	}
		
}
}