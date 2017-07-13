import java.sql.*;
public class JdbcTest {

	public static String DRIVER_CLASS="com.mysql.jdbc.Driver";
	public static String DATABASE_URL="jdbc:mysql://172.17.174.105:3306/prashant";
	public static String USER_NAME="root";
	public static String password="root";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
	
		Connection con=getconnection();
		//insert("Haggu",34);
		//get();
		//delete(13);
		//get();
		//update("Prakhar",24);
		//prepared();
		//get();
		CallableStatement stmt=con.prepareCall("{call ppp(?,?)}");  
		stmt.setInt(2,101);  
		stmt.setString(1,"Amit");  
		stmt.execute();  
		get();

	}
	
public static void insert(String n,int a) throws SQLException, ClassNotFoundException
{
	
	Connection connection=null;
	Statement statement=null;
	final String INSERT="insert into pp values('"+n+"',"+a+")";
	try
	{
	connection=getconnection();
	statement=connection.createStatement();
statement.executeUpdate(INSERT);
	
	}
	
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}



public static void prepared() throws SQLException, ClassNotFoundException
{
	Connection con=getconnection();
	String query="select * from pp where name=? and age=?";   //? are used only for representing values
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, "Kro");
	ps.setInt(2, 12);
	ResultSet rs=ps.executeQuery();
	
	while(rs.next())
	{
		System.out.println(rs.getString(1)+" "+rs.getInt(2));
	}

}

public static void delete(int a)throws SQLException, ClassNotFoundException
{
	Connection connection=null;
	Statement statement=null;
	final String DELETE="delete from pp where age="+a;
	try
	{
	connection=getconnection();
	statement=connection.createStatement();
statement.executeUpdate(DELETE);
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static void update(String n,int a)
{
	Connection connection=null;
	Statement statement=null;
	final String UPDATE="update pp set name='"+n+"' where age="+a;
	try
	{
	connection=getconnection();
	statement=connection.createStatement();
statement.executeUpdate(UPDATE);
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static void get()
{
	Connection connection=null;
	Statement statement=null;
	try
	{
	connection=getconnection();
	statement=connection.createStatement();
	ResultSet rs=statement.executeQuery("select * from pp");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+" "+rs.getInt(2));
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static Person getAllPerson()
{
	Connection connection;
	try
	{
		connection=getconnection();
		System.out.println(connection);
		Statement statement=connection.createStatement();
	}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}

public static void delete(final Person person)
{
	
}

public static Connection getconnection()throws ClassNotFoundException, SQLException
{
	Class.forName(DRIVER_CLASS);
	Connection connection=DriverManager.getConnection(DATABASE_URL,USER_NAME,password);
	return connection;
}

public static void close(final Connection connection) throws SQLException
{
	if(connection!=null)
	{
	
	connection.close();
}
}

	private static void printPersons(final ResultSet resultSet)
	{
		if(resultSet==null)
		{
			System.out.println("No Record Fetched");
		}
		System.out.println(resultSet);
	}
}
