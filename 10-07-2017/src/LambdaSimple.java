import java.util.*;
import java.util.function.Consumer;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class LambdaSimple {
public static void main(String[] args)
{
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	
/*	Thread t=new Thread(new Runnable() {
		public void run() {
			for(int i=0;i<list.size();i++)          //
				System.out.println(list.get(i));
		}
	});
	t.start();  */
	
	
/*	Thread t=new Thread(()->{
		for(Integer i:list)    //External Iterator (full control)
		{
			System.out.println(list.get(i-1));
			};
			
			
			
			//or
	*/		
			
	/*		list.forEach(new Consumer<Integer>()  //Internal Iterator
			{      
				public void accept(Integer t)
				{
					System.out.println(t);
				}
			});
			
			
			//or
			
		*/	
			list.forEach((Integer t)->System.out.println(t)); //Using Lambda
			
//or
			System.out.println();
			
			list.forEach((t)->System.out.println(t));
			
			//or
			
			System.out.println();
			
			list.forEach(System.out::println);   //VIP
			
			System.out.println();

			LambdaTime.code(()->{list.forEach(LambdaSimple::hello);});
			
			System.out.println();
			
			list.stream()
			    .map(String::valueOf)
		     	.forEach(System.out::println);
			
			System.out.println();
			
			System.out.println(list.stream()
			.filter(val->val<5)  //for no.s <5
			.filter(val->val%2==0) //for even no.s
			.mapToInt(val->val)
			.sum());
			//.forEach(System.out::println);
			
			LambdaTime.code(()->
			System.out.println(list.stream()
					.filter(LambdaSimple::isgreater3)  //for no.s <5
					.filter(LambdaSimple::iseven) //for even no.s
					.mapToDouble(LambdaSimple::compute)
					.sum()));
}

public static boolean iseven(int x)
{
	return x%2==0;
}

public static boolean isgreater3(int x)
{
	return x>3;
}

public static double compute(int x){
	return x*2;
}

public static void hello(int a)
{
	try
	{
		Thread.sleep(350);
	System.out.println("Hello "+a);
	}
	catch(Exception e)
	{
	}
	}
}
