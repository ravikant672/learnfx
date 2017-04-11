package controller;

import java.io.IOException;


import javaController.DBOperation;
import javaController.UserLogin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailId = request.getParameter("emailId");
		String password= request.getParameter("password");
		
		
		UserLogin v= new UserLogin(emailId,password);
		String userValidate = DBOperation.authenticateUser(v); //Calling authenticateUser function
		 
		if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
		 {
		// request.setAttribute("emailId", emailId); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
		 //request.getRequestDispatcher("/Home.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
		 HttpSession s=request.getSession(true);
		    s.setAttribute("emailId",emailId );
		    s.setAttribute("password", password);
		   
		    response.sendRedirect("index.jsp");
		 }
		 else
		 {
		 //request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
		 //request.getRequestDispatcher("/Login.jsp").forward(request, response);//forwarding the request
		 RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
			request.setAttribute("msg","Please Check your Login Credentials");
			rd.forward(request, response);
			//response.sendRedirect("login.jsp");
		 }
	
	
	}

}
