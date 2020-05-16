package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil.TeacherDBUtil;

@WebServlet("/UpdateTeacher")
public class UpdateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		//String status = request.getParameter("status");
		System.out.println(id);
		String status = "approve";
		
		boolean isTrue;
		
		isTrue = TeacherDBUtil.updateTeacher(id, status);
		
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
