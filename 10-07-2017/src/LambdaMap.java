import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;;

public class LambdaMap {
public static void main(String[] args)
{
	List<Person> list=Arrays.asList(new Person("Prakhar",24,GenderEnum.Male),
			new Person("Shikhar",23,GenderEnum.Male),
			new Person("Kro",12,GenderEnum.Male));
	
/*	Map<Integer,String> map=
	list.stream()
	.collect(Collectors.toMap((Person p)->p.getage(), (Person p)->p.getname()));
	map.entrySet().forEach(System.out::println);
*/
	System.out.println();
	
	Map<String,Person> mapWithNameKey=
			list.stream()
			.collect(Collectors.toMap((Person p)->p.getname()+"-"+p.getage(), (Person p)->p));
			mapWithNameKey.entrySet().forEach(System.out::println);

			System.out.println();
			
			Map<GenderEnum,List<Person>> mapWithNameKey1=
					list.stream()
					.collect(Collectors.groupingBy(Person::getgender));
					mapWithNameKey1.entrySet().forEach(System.out::println);

	System.out.println();

	List<Integer> num=Arrays.asList(1,3,5,4,2,7,9,6,8,10);
	
	System.out.println(num.stream()
			.map(v->v.toString())
			.reduce("",(v,k)->v+k));
	
	System.out.println(num.stream()
		.filter(v->v>3)
		.filter(v->v%3==0)
		.reduce(0,(v,k)->v+k));
	
	System.err.println(num.stream()
			.filter(v->v>3)
			.map(v->v%3)
			.reduce(0,(v,k)->v+k));
	
	System.out.println(list.stream()
			.map((Person v)->v.getname())
			.reduce("",(v,k)->v.concat(k)));
	
	// Working :-
	//    List	Filter(>3)	Filter(even)	Reduce
	//    1 ----- |
	//    3 ----- |
	//    5 ------------------- |
	//    4 --------------------------------4
	//    2 ----- |                          \
	//    7 ------------------- |             \
	//    9 ------------------- |              \
	//    6 ------------------------------------6
	//    8 -------------------------------------8
	//    10 -------------------------------------10
}
}
