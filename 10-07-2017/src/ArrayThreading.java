
public class ArrayThreading extends Thread{
private int hi;
private int lo;
private int  arr[];
private int ans=0;

public ArrayThreading(int[] arr,int lo,int hi)
{
	super();
	this.arr=arr;
	this.lo=lo;
	this.hi=hi;
	
}



public void run()
{
	for(int i=lo;i<hi;i++)
	{
		ans+=arr[i];
	}
}

public static int sum(int ar[]) throws InterruptedException
{
	int len=ar.length;
	int ans=0;
	ArrayThreading[] art=new ArrayThreading[4];
	for(int i=0;i<4;i++)
	{
		art[i]=new ArrayThreading(ar, i*len/4, (i+1)*len/4);
		art[i].start();
	}
	for(int i=0;i<4;i++)
	{
		art[i].join();
		ans+=art[i].ans;
	}
	return ans;

}
public static void main(String[] args) throws InterruptedException
{
	int ar[]=new int[10];
	for(int i=0;i<10;i++)
	{
		ar[i]=i+1;
	}
	int sum=sum(ar);
	System.out.println(sum);
}
}
