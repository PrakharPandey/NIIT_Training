
public class Person {

	String name;
	GenderEnum gender;
	int age;
	
	Person(String n,int a,GenderEnum g)
{
	name=n;
	age=a;
	gender=g;
}
	
	int getage()
	{
		return age;
	}
	
	String getname()
	{
		return name;
	}
	
	GenderEnum getgender()
	{
		return gender;
	}
	
	public String toString()
	{
		return "[name= "+name+" age= "+age+" gender= "+gender+"]";
	}
}
