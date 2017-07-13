

	public class Triangle extends Shape{
		
		public void draw()
		{
			for(int i=1;i<=length;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
				System.out.println();
			}
		}
		}

