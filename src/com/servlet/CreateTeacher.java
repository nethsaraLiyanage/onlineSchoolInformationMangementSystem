package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil.TeacherDBUtil;

@WebServlet("/CreateTeacher")
public class CreateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CreateTeacher() {
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
		String edu = request.getParameter("edu");
		int admin = Integer.parseInt(request.getParameter("admin"));
		int timetable = Integer.parseInt(request.getParameter("timetable"));
		int subject = Integer.parseInt(request.getParameter("subject"));
		
		boolean isTrue;
		
		isTrue = TeacherDBUtil.insertTeacher(empName, address, contactNo, email, userName, password, status, edu, admin, timetable, subject);
		
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
