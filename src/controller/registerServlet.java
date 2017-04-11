package controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaController.DBOperation;
import javaController.User;
import javaController.Database;


@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public registerServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/adduser.jsp");
		request.setAttribute("err", "This id is already registered !");
		rd.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String dob = request.getParameter("dob");
	String mobile = request.getParameter("mobile");
	String address = request.getParameter("address");
	String city = request.getParameter("city");
	String state = request.getParameter("state");
	String country = request.getParameter("country");
	String emailId = request.getParameter("emailId");
	String password = request.getParameter("password");
	
	
	User u=new User(fname, lname, dob,mobile,address,city,state,country,emailId);
	u.setPassword(password);
	if(DBOperation.addUser(u)){
		response.sendRedirect("login.jsp");
	}
	else
	{
		doGet(request,response);
	}
	
	
		
	}

}
