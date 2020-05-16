package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil.TeacherDBUtil;

@WebServlet("/RemoveTeacher")
public class RemoveTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("tID");
		
		boolean isTrue;
		
		isTrue = TeacherDBUtil.removeTeacher(id);
		
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
