package javaController;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	static Connection con=null;
	static void Connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Load driver");
			//con= DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/ad_c1933d109e1298a?user=b55de50d240a78&password=cebd13f4");
			con = DriverManager.getConnection("jdbc:mysql://localhost/learnfx", "root", "");
			 
			//System.out.println("Database connected...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static
	{
		Connect();
	}
	static Connection getConnection()
	{
		return con;
		
	}
}
