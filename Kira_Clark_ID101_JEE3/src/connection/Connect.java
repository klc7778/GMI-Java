package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	static Connection conn;

	public static Connection getConnection()
	{
		try
		{
			System.out.println("Connecting to the database...");
			String url = "jdbc:mysql://localhost:8080/database";
			String uname = "root";
			String pwd = "Sapient123";

			Class.forName("com.mysql.jdbc.Driver");
			try
			{
				conn = DriverManager.getConnection(url,uname,pwd);
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		return conn;
}

}
