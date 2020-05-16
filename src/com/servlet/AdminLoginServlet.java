package com.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBUtil.AdminDBUtil;
import com.model.Login;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(AdminLoginServlet.class.getName()); 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * HttpSession session = request.getSession(); String regnoString = (String)
		 * session.getAttribute("empNo");
		 */
		
		
		
		try {
			//fetching user inputs
			String usernameSt = request.getParameter("uname");
			String passwordSt = request.getParameter("pwd");
			String isSubmitString = request.getParameter("login");
			
			//creating a object from Login class 
			Login login = new Login();
			
			//creating a object from AdminDBUtil class 
			AdminDBUtil admin = new AdminDBUtil();
			
			//saving user inputs to login 
			login = admin.getData(usernameSt, passwordSt);
			
			if(isSubmitString.equals("login") && login.getUsernameSt() != null && login.getPasswordSt() != null) {
				
				HttpSession session1 = request.getSession();
				session1.setAttribute("empNo", login.getEmpNoSt());
				response.sendRedirect("UpdateDashboardServlet");
				//response.sendRedirect("UpdateDashboardServlet");
				
			}
			else {
				
				//if username password incorrect
				
				request.setAttribute("error", "Invalid Username/Password");
				request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
				
			}
		}catch(Exception e){
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
	}

}
