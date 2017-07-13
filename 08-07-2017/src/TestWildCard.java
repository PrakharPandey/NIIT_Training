import java.util.*;

public class TestWildCard {
public static void main(String[] args)
{
	// List<Account> ac=new ArrayList<LoanAccount>();   //This is not Possible
	List<?> acc=new ArrayList<LoanAccount>();  //Use this when you don't know the type of class
	System.out.println(acc.size());
}
}
