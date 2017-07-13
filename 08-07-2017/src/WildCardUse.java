import java.util.*;

public class WildCardUse {
static void print(List<?> list)
{
	for(Object element: list)
		System.out.println("["+element+"]");
}

public static void main(String[] args)
{
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(100);
	print(list);
	List<String> stlist=new ArrayList<>();
	stlist.add("Hi");
	stlist.add("Hey");
	print(stlist);
}

}
