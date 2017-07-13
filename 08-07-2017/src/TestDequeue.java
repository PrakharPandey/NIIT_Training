import java.util.*;
public class TestDequeue {
public static void main(String[] args)
{
	Deque<String> dq=new ArrayDeque<String>();
	dq.add("Prakhar");
	dq.add("Shikhar");
	dq.add("a");
	dq.add("b");
	dq.add("c");
	
	for(String st: dq)
	{
		System.out.println(st);
	}
	String value=dq.peek();  //retrieve but does not delete element
	System.out.println(dq);
	System.out.println(value);
	
	value=dq.pop();  //retrieve and remove element
	System.out.println(dq);
	System.out.println(value);
	
	value=dq.pop();  //retrieve and remove element
	System.out.println(dq);
	System.out.println(value);
	
	value=dq.poll();  //remove from the head
	System.out.println(dq);
	System.out.println(value);
	
	dq.offer("hey");  //insert at the tail
	System.out.println(dq);
	dq.offerFirst("hi");  //insert at start or head
	System.out.println(dq);

	dq.offerLast("hello");  //insert at tail
	System.out.println(dq);
}
}
