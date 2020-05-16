package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil.StudentDBUtil;

@WebServlet("/CreateStudent")
public class CreateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public CreateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("stname");
		String address = request.getParameter("staddress");
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		String clz = request.getParameter("class");
		
		boolean isTrue;
		
		isTrue = StudentDBUtil.insertStudent(name, address, username, password, clz);
		
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
