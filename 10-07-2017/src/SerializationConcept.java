import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class SerializationConcept {
	public static void main(String[] args) throws IOException
	{
		try {
Person p=new Person("Prakhar", 24, GenderEnum.Male);
	    ObjectInputStream fin = new ObjectInputStream(new FileInputStream("D:\\a.txt"));
	    ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream("D:\\b.txt"));
	   


	     
	fout.writeObject(p);
	    
	    fout.close();
	    fin.close();
		
	    System.out.println("Done reading and writing!!");

	} catch(Exception e){
	  System.out.println(e);
	}

	}
}
