
public class DiamondCase<T,U> {
private T t;
private U u;
public DiamondCase(T t,U u)
{
	this.t=t;
	this.u=u;
}
public void print()
{
	System.out.println(this.t+" "+this.u);
}
}