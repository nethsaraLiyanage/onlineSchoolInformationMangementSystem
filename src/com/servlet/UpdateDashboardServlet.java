package com.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.security.auth.Subject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBUtil.UpdateDashboard;

import com.model.Clerk;
import com.model.ClerkRequest;
import com.model.Student;
import com.model.Teacher;
import com.model.TeacherRequest;

/**
 * Servlet implementation class UpdateDashboardServlet
 */
@WebServlet("/UpdateDashboardServlet")
public class UpdateDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// Get the session value
		HttpSession session = request.getSession(); 
		String empNoString = session.getAttribute("empNo").toString();
		request.setAttribute("empNo", empNoString);
		
		
		
		try {
			
			//creating a object of the UpdateDashboard class
			UpdateDashboard dashboardMethods = new UpdateDashboard();
			
			//get the name related to the session id
			String sessionName = dashboardMethods.getAdminName(empNoString);
			request.setAttribute("sessionName", sessionName);
			
			//fetch and set the total no of students
			int totStudents = dashboardMethods.totStudents();
			//request.setAttribute("totStudents", totStudents);
			request.setAttribute("tot", totStudents);
			//System.out.println(totStudents);
			
			//fetch and set the total no of teachers
			int totTeachers = dashboardMethods.totTeachers();
			request.setAttribute("totTeachers", totTeachers);
			
			//fetch and set the total no of clerks
			int totClerks = dashboardMethods.totClerks();
			request.setAttribute("totClerks", totClerks);
			
			//fetch and set the total no of subjects
			int totSubjects = dashboardMethods.totSubjects();
			request.setAttribute("totSubjects", totSubjects);
			
			//fetch and set the total no of extra-curriculers
			int totExCurricular = dashboardMethods.totExCurricular();
			request.setAttribute("totExCurricular", totExCurricular);
			
			//fetch and set the total no of Classes
			int totClasses = dashboardMethods.totClasses();
			request.setAttribute("totClasses", totClasses);
			
			
			//fetching request details from UpdateDashboard class
			ArrayList<com.model.TeacherRequest> tRequests = dashboardMethods.getTeacherRequests();
			//setting the attribute to the request object
			request.setAttribute("tRequests", tRequests);
			
			//fetching request details from UpdateDashboard class
			ArrayList<com.model.ClerkRequest> cRequests = dashboardMethods.getClerkRequests();
			//setting the attribute to the request object
			request.setAttribute("cRequests", cRequests);
			
			//fetching request details from UpdateDashboard class
			ArrayList<com.model.Student> student = dashboardMethods.getStudentDetails();
			//setting the attribute to the request object
			request.setAttribute("student", student);
			
			//fetching request details from UpdateDashboard class
			ArrayList<com.model.Teacher> teacher = dashboardMethods.getTeacherDetails();
			//setting the attribute to the request object
			request.setAttribute("teacher", teacher);
			
			//fetching request details from UpdateDashboard class
			ArrayList<com.model.Clerk> clerk = dashboardMethods.getClerkDetails();
			//setting the attribute to the request object
			request.setAttribute("clerk", clerk);
			
			//fetching request details from UpdateDashboard class
			ArrayList<com.model.Subject> subject = dashboardMethods.getSubjectDetails();
			//setting the attribute to the request object
			request.setAttribute("subject", subject);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
			dispatcher.forward(request, response);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
