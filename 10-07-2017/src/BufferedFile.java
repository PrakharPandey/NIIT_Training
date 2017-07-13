import java.io.*;

public class BufferedFile {
	public static void main(String[] args) throws IOException
	{
		try {

	    BufferedReader fin = new BufferedReader(new FileReader("D:/a.txt"));
	    BufferedWriter fout = new BufferedWriter(new FileWriter("D:/b.txt"));
	   
	   String st;
	    while((st=fin.readLine())!=null)
	    		{
	    
	    fout.write(st);
	    
	    }

	    fout.close();
	    fin.close();

	    System.out.println("Done reading and writing!!");

	} catch(Exception e){
	  System.out.println(e);
	}

	}

}
