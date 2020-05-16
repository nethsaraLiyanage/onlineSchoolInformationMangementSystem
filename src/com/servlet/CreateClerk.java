package com.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil.ClerkDBUtil;


@WebServlet("/CreateClerk")
public class CreateClerk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//initializing logger
	private static final Logger LOGGER = Logger.getLogger(CreateClerk.class.getName()); 
    
    public CreateClerk() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empName = request.getParameter("empName");
		String address = request.getParameter("address");
		String contactNo = request.getParameter("contactNo");
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String status = request.getParameter("status");
		String level = request.getParameter("level");
		int admin = Integer.parseInt(request.getParameter("admin"));
		
		
		boolean isTrue;
		
		isTrue = ClerkDBUtil.insertClerk(empName, address, contactNo, email, userName, password, status, level, admin);
		
		if(isTrue == true) {
			/*
			 RequestDispatcher dis = request.getRequestDispatcher("UpdateDashboardServlet"); 
			 dis.forward(request,response);
			 */
			response.sendRedirect("UpdateDashboardServlet");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
