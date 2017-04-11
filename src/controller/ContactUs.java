package controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class ContactUs
 */
@WebServlet("/ContactUs")
public class ContactUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ContactUs() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Connection conn=null;
		String url="jdbc:mysql://127.0.0.1:3306/conn1";
		String dbName="fxProject";
		String deriver="com.mysql.jdbc.Driver";
		//String dbUserNamr="";
		//String dbPassword="";
		try{
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String message=request.getParameter("message");
			
			Class.forName(deriver).newInstance();
			conn=DriverManager.getConnection(url+dbName,"root","");
			PreparedStatement pst=(PreparedStatement)conn.prepareStatement("insert into fxProject.contact(name,email,message)value(?,?,?)");
			pst.setString(1,name);
			pst.setString(2, email);
			pst.setString(3, message);
			
			
			int i = pst.executeUpdate();
	          conn.commit(); 
	          String msg=" ";
	          if(i!=0){  
	            msg="Record has been inserted";
	            pw.println("<font size='6' color=blue>" + msg + "</font>");
		}
		
	
		else{  
            msg="failed to insert the data";
            pw.println("<font size='6' color=blue>" + msg + "</font>");
           }  
          pst.close();
        }  
        catch (Exception e){  
          pw.println(e);  
        }  
	}
}
