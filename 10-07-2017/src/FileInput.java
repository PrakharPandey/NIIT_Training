import java.io.*;
public class FileInput {
public static void main(String[] args) throws IOException
{
	try {

    FileInputStream fin = new FileInputStream("D:\\a.txt");
    FileOutputStream fout = new FileOutputStream("D:\\b.txt");
   
    int i;
    while((i=(fin.read()))!=-1) {

     
fout.write(i);
    }
    fout.close();
    fin.close();

    System.out.println("Done reading and writing!!");

} catch(Exception e){
  System.out.println(e);
}

}
}
