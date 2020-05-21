package com.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.database.DBConnect;

public class StudentDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
 
	/** logger class initializing here **/
	private static final Logger LOGGER = Logger.getLogger(StudentDBUtil.class.getName());
	
	public static boolean insertStudent(String name, String address, String username, String password, String clz) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			 
			String sql = "insert into Student values (0, '"+name+"', '"+address+"', '"+username+"', '"+password+"', '"+clz+"')";
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
	
	public static boolean removeStudent(String id) {
		
		boolean isSuccess = false;
				
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					
					String sql = "DELETE FROM student WHERE sId = '"+id+"' ";
					
					int rs = stmt.executeUpdate(sql);
					
					if(rs > 0) {
						isSuccess = true;
					}
					else {
						isSuccess = false;
					}
					
		
				}
				catch (Exception e) {
					/** logger class messege **/
					LOGGER.log(Level.SEVERE, e.getMessage());
				}
				
				return isSuccess;
	}
}
