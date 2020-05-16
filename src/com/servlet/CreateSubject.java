package com.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil.SubjectDBUtil;


@WebServlet("/CreateSubject")
public class CreateSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String subName = request.getParameter("subName");
		String grade = request.getParameter("grade");
		String periods = request.getParameter("nop");
	
		boolean isTrue;
		
		isTrue = SubjectDBUtil.insertSubject(subName, grade, periods);
		
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
