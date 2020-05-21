package com.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.database.DBConnect;
import com.model.Clerk;
import com.model.ClerkRequest;
import com.model.Student;
import com.model.Subject;
import com.model.Teacher;
import com.model.TeacherRequest;

import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;

public class UpdateDashboard {

	private static Connection con;
	private static Statement stmt = null;
	private static ResultSet rs;
	static java.sql.PreparedStatement preparedStatement;

	/** logger class initializing here **/
	private static final Logger LOGGER = Logger.getLogger(UpdateDashboard.class.getName());

	//get the admin name 
	
	 public String getAdminName(String empNoString){
	  
		 String empName = null; 
		 try {
		  
			 // create db 
			 Connection con = DBConnect.getConnection(); 
			 // sql query object
			 
			 preparedStatement =con.prepareStatement("Select empName from admin where empId = ?");
			 preparedStatement.setString(1,empNoString);
			 
			 ResultSet rs = preparedStatement.executeQuery();
			 
			 while (rs.next()) { empName = rs.getString("empName");
			 System.out.println(empName); } con.close();
			 
			 }catch (Exception e) {
					/** logger class messege **/
					LOGGER.log(Level.SEVERE, e.getMessage());
				 }
	  
	 	return empName;
	 
	 }
	 

	// calculate total no of students
	public int totStudents() {

		int tot = 0;

		try {
			// create db connection
			con = DBConnect.getConnection();
			// sql query object
			// sql = "SELECT COUNT(*) as 'count' FROM student";
			preparedStatement = con.prepareStatement("SELECT COUNT(*) as 'count' FROM student");
			// Statement stmt = con.createStatement();

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				tot = rs.getInt("count");
				//System.out.println(tot);
			}
			con.close();

		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return tot;
	}

	// calculate total no of teachers
	public static int totTeachers() {

		int tot = 0;

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT COUNT(*) as count FROM teacher";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				tot = rs.getInt("count");
			}

		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return tot;

	}

	// calculate total no of clerks
	public static int totClerks() {

		int tot = 0;

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT COUNT(*) as count FROM clerk";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				tot = rs.getInt("count");
			}

		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return tot;

	}

	// calculate total no of subjects
	public static int totSubjects() {

		int tot = 0;

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT COUNT(*) as count FROM subject";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				tot = rs.getInt("count");
			}

		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return tot;

	}

	// calculate total no of activities
	public static int totExCurricular() {

		int tot = 0;

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT COUNT(*) as count FROM `extra-curricular`";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				tot = rs.getInt("count");
			}

		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return tot;

	}

	// calculate total no of classes
	public static int totClasses() {

		int tot = 0;

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT COUNT(*) as count FROM class";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				tot = rs.getInt("count");
			}

		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return tot;
	}

	// display all teacher requests
	public ArrayList<TeacherRequest> getTeacherRequests() {

		ArrayList<TeacherRequest> tRequests = new ArrayList<TeacherRequest>();

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT * FROM teacher WHERE status = 'Not approved'";

			Statement stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String contact = rs.getString(4);
				String email = rs.getString(5);
				String status = rs.getString(8);
				String qualification = rs.getString(9);

				TeacherRequest tr = new TeacherRequest(id, name, address, contact, email, status, qualification);
				System.out.println(tr.getId());
				tRequests.add(tr);
			}

		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return tRequests;
	}

	// display all clerks requests
	public ArrayList<ClerkRequest> getClerkRequests() {

		ArrayList<ClerkRequest> cRequests = new ArrayList<ClerkRequest>();

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT * FROM clerk WHERE status = 'Not approved'";

			Statement stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String contact = rs.getString(4);
				String email = rs.getString(5);
				String status = rs.getString(8);
				String level = rs.getString(9);

				ClerkRequest cr = new ClerkRequest(id, name, address, contact, email, status, level);
				System.out.println(cr.getId());
				cRequests.add(cr);
			}
		} catch (Exception e) {
					/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return cRequests;
	}

	// display all Student details
	public ArrayList<Student> getStudentDetails() {

		ArrayList<Student> student = new ArrayList<Student>();

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT * FROM student";

			Statement stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String uname = rs.getString(4);
				String password = rs.getString(5);
				String cls = rs.getString(6);

				Student stud = new Student(id, name, address, uname, password, cls);
				student.add(stud);
			}
		} catch (Exception e) {
			/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return student;
	}

	// display all teacher details
	public ArrayList<Teacher> getTeacherDetails() {

		ArrayList<Teacher> teacher = new ArrayList<Teacher>();

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT * FROM teacher";

			Statement stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String contact = rs.getString(4);
				String email = rs.getString(5);
				String uname = rs.getString(6);
				String password = rs.getString(7);
				String status = rs.getString(8);
				String qualification = rs.getString(9);
				String tid = rs.getString(11);
				String sub = rs.getString(12);

				Teacher tec = new Teacher(id, name, address, contact, email, uname, password, status, qualification,
						tid, sub);
				teacher.add(tec);
			}
		} catch (Exception e) {
			/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return teacher;
	}

	// display all clerk details
	public ArrayList<Clerk> getClerkDetails() {

		ArrayList<Clerk> clerk = new ArrayList<Clerk>();

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT * FROM clerk";

			Statement stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String contact = rs.getString(4);
				String email = rs.getString(5);
				String uname = rs.getString(6);
				String password = rs.getString(7);
				String status = rs.getString(8);
				String level = rs.getString(9);

				Clerk crk = new Clerk(id, name, address, contact, email, uname, password, status, level);
				clerk.add(crk);
			}
		} catch (Exception e) {
			/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return clerk;
	}

	// display all subject details
	public ArrayList<Subject> getSubjectDetails() {

		ArrayList<Subject> subject = new ArrayList<Subject>();

		try {
			// create db connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			// sql query object
			String sql = "SELECT * FROM subject";

			Statement stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String grade = rs.getString(3);
				String periods = rs.getString(4);

				Subject sub = new Subject(id, name, grade, periods);
				subject.add(sub);
			}
		} catch (Exception e) {
			/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}

		return subject;
	}
}
