
public class Testcompiletime {
                       
	public static void main(String[] args)throws Ownthrow      //CompileTime requires throws
	{
		
		int aa[]={1,2,3,4,5};
			try{

		
	  System.out.println(aa[100]);
			}
	
		catch(Exception e)
		{
			
			throw new Ownthrow("My Exception");

			
		}
			finally
			{
				System.out.println("Finally Block");
			}
			
	}
	}
