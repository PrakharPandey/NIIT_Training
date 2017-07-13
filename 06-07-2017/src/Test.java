
public class Test {
public static void main(String[] args)
{
	Rectangle obj=new Rectangle();
    Triangle ob=new Triangle();
Shape shape=obj;
    shape.length=8;
    shape.breadth=10;
    shape.draw();
    System.out.println();
shape=ob;
    shape.length=8;
    shape.draw();
    System.out.println();
    Shape obb=new Shape(){                    //Anonymous Class
    	public void draw()
    	{
    		for(int i=1;i<=length;i++)
    		{
    			for(int j=1;j<=breadth;j++)
    			{
    				if(i==1||j==1||i==length||j==breadth)
    					System.out.print("*");
    				else
    					System.out.print(" ");
    			}
    			System.out.println();
    		}
    	}
    };
    obb.length=8;
    obb.breadth=10;
	obb.draw();
	
	System.out.println();
	
	Shape oobb=new Shape(){                    //Anonymous Class
    	public void draw()
    	{
    		for(int i=1;i<=length;i++)
    		{
    			for(int j=1;j<=i;j++)
    			{
    				if(i==1||j==1||j==i||i==length)
    					System.out.print("*");
    				else
    					System.out.print(" ");
    			}
    			System.out.println();
    		}
    	}
    };
    oobb.length=8;
	oobb.draw();
}
}
