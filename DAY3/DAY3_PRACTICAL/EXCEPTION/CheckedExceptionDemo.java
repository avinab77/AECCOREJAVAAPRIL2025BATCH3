package EXCEPTION;
import java.sql.*;
class TestConnection
{
	public void testConnection()
	{
		try
		{
		Class.forName("java.oracle.driver");
		Connection cn=DriverManager.getConnection("scott");
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	

}
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
