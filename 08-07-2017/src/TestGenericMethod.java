import java.util.*;

public class TestGenericMethod {
public static void main(String[] args)
{
	List<Integer> il=new ArrayList<Integer>();
	il.add(10);
	il.add(20);
	System.out.println("The original list is: "+il);
	GenericMethods.fill(il, 100);
	System.out.println("The list after calling generic method is: "+il);
}
}
