package javaController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DBOperation {

	public static boolean addUser(User u){
	try
	{
		Connection con=Database.getConnection();
		String q="INSERT INTO `user` (`emailId`,`password`, `fname`,`lname`, `dob`,  `mobile`,`address`, `city`,`state`,`country`) VALUES ('"+u.getemailId()+"','"+u.getPassword()+"', '"+u.getFname()+"','"+u.getlname()+"', '"+u.getdob()+"','"+u.getmobile()+"', '"+u.getaddress()+"', '"+u.getcity()+"', '"+u.getState()+"','"+u.getCountry()+"')";
		PreparedStatement pst=con.prepareStatement(q);
		pst.executeUpdate();
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}	
	}
	
	/*public static boolean loginCheck(UserLogin v){
		try{
			Connection con= Database.getConnection();
			String r= "select * from user where emailId='"+v.getemailId()+"'and password='"+v.getPassword()+"'";
			PreparedStatement pst=con.prepareStatement(r);
			
			pst.executeQuery();
			
			return true;
			
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}*/
	
	 public static String authenticateUser(UserLogin v)
	 {
	 
	String userName = v.getemailId(); //Keeping user entered values in temporary variables.
	 String password = v.getPassword();
	 
	//Connection con = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	 
	String userNameDB = "";
	 String passwordDB = "";
	 
	try
	 {
		Connection con= Database.getConnection(); //establishing connection
	 statement = (Statement) con.createStatement(); //Statement is used to write queries. Read more about it.
	 resultSet = statement.executeQuery("select emailId,password from user"); //Here table name is user and emailId,password are columns. fetching all the records and storing in a resultSet.
	 
	while(resultSet.next()) // Until next row is present otherwise it return false
	 {
	  userNameDB = resultSet.getString("emailId"); //fetch the values present in database
	  passwordDB = resultSet.getString("password");
	 
	   if(userName.equals(userNameDB) && password.equals(passwordDB))
	   {
	      return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
	   }
	 }
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Invalid user credentials"; // Just returning appropriate message otherwise
	 }
	
}
