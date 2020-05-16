package com.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.database.DBConnect;

import javax.servlet.RequestDispatcher;

public class TeacherDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	/** Initialize logger */
	private static final Logger LOGGER = Logger.getLogger(TeacherDBUtil.class.getName());

	public static boolean insertTeacher(String empName, String address, String contactNo, String email, String userName,
			String password, String status, String edu, int admin, int timetable, int subject) {
		// TODO Auto-generated method stub

		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			 
			//String sql = "insert into Teacher values (0, '"+empName+"', '"+address+"','"+contactNo+"', '"+email+"', '"+userName+"', '"+password+"', '"+status+"', '"+edu+"', +admin+, +timetable+, +subject+ )";
			
			PreparedStatement pstmt = con.prepareStatement("insert into Teacher values(?,?,?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1,null);
			pstmt.setString(2,empName);
			pstmt.setString(3,address);
			pstmt.setString(4,contactNo);
			pstmt.setString(5,email);
			pstmt.setString(6,userName);
			pstmt.setString(7,password);
			pstmt.setString(8,status);
			pstmt.setString(9,edu);
			pstmt.setInt(10,admin);
			pstmt.setInt(11,timetable);
			pstmt.setInt(12,subject);
			
			int numRowsChanged = pstmt.executeUpdate();
            if(numRowsChanged!=0){
                System.out.println("Successfull execution");
                isSuccess = true;
            }
            else{
                System.err.println("Problem with the insertion query");
                isSuccess = false;
            }
            pstmt.close();
			
			/*int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}*/
			
		}
		catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
		
	}
	
	public static boolean updateTeacher(int id, String status) {
		
		boolean isSuccess = false;
				
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					
					//String sql = "Update teacher set status = 'Approved'";
					System.out.println(id);
					PreparedStatement pstmt = con.prepareStatement("Update teacher set status = 'Approved' where empId = ?");
					pstmt.setInt(1,id);
				
					
					int numRowsChanged = pstmt.executeUpdate();
		            if(numRowsChanged!=0){
		                System.out.println("Successfull execution");
		                isSuccess = true;
		            }
		            else{
		                System.err.println("Problem with the insertion query");
		                isSuccess = false;
		            }
		            pstmt.close();
					
					
					/*int rs = stmt.executeUpdate(sql);
					
					if(rs > 0) {
						isSuccess = true;
					}
					else {
						isSuccess = false;
					}*/
					
		
				}
				catch (Exception e) {
					LOGGER.log(Level.SEVERE, e.getMessage());
				}
				
				return isSuccess;
	}
	
	public static boolean removeTeacher(String id) {
		
		boolean isSuccess = false;
				
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					
					String sql = "DELETE FROM teacher WHERE empId = '"+id+"' ";
					
					int rs = stmt.executeUpdate(sql);
					
					if(rs > 0) {
						isSuccess = true;
					}
					else {
						isSuccess = false;
					}
					
		
				}
				catch (Exception e) {
					LOGGER.log(Level.SEVERE, e.getMessage());
				}
				
				return isSuccess;
	}



	
}
