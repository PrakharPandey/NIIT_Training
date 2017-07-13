
public class FactorialLargeNoUsingThread extends Thread{

		private int hi;
		private int lo;
		private int  fac;
		private int ans=1;

		public FactorialLargeNoUsingThread(int fac)
		{
			super();
			this.fac=fac;
			
			
		}



		public void run()
		{
			for(int i=fac;i>=1;i++)
			{
				ans*=i;
			}
		}

		public static int sum(int f) throws InterruptedException
		{
		
			int ans=1;
			FactorialLargeNoUsingThread[] art=new FactorialLargeNoUsingThread[4];
			for(int i=0;i<4;i++)
			{
				art[i]=new FactorialLargeNoUsingThread(f);
				art[i].start();
			}
			for(int i=0;i<4;i++)
			{
				art[i].join();
				ans*=art[i].ans;
			}
			return ans;

		}
		public static void main(String[] args) throws InterruptedException
		{
			int ar=100;
			long summ=sum(ar);
			System.out.println(summ);
		}
		}


