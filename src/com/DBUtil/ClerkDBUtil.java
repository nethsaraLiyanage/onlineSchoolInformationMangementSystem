package com.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.database.DBConnect;


public class ClerkDBUtil {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	/** logger class initializing here **/
	private static final Logger LOGGER = Logger.getLogger(ClerkDBUtil.class.getName());
	
	public static boolean insertClerk(String empName, String address, String contactNo, String email, String userName,
			String password, String status, String level, int admin) {


		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			 
			//String sql = "insert into Teacher values (0, '"+empName+"', '"+address+"','"+contactNo+"', '"+email+"', '"+userName+"', '"+password+"', '"+status+"', '"+level+"', 'admin')";
			
			
			PreparedStatement pstmt = con.prepareStatement("insert into clerk values(?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1,null);
			pstmt.setString(2,empName);
			pstmt.setString(3,address);
			pstmt.setString(4,contactNo);
			pstmt.setString(5,email);
			pstmt.setString(6,userName);
			pstmt.setString(7,password);
			pstmt.setString(8,status);
			pstmt.setString(9,level);
			pstmt.setInt(10,admin);
			
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
			
			
		}
		catch (Exception e) {
			/** logger class messege **/
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	
	
	public static boolean updateClerk(int id, String status) {
		
		boolean isSuccess = false;
				
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					
					//String sql = "Update clerk set status = 'Approved' where empId = ?";
					
					PreparedStatement pstmt = con.prepareStatement("Update clerk set status = 'Approved' where empId = ?");
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
					
					//int rs = stmt.executeUpdate(sql);
					/*int rs = pstmt.executeUpdate();
					if(rs > 0) {
						isSuccess = true;
					}
					else {
						isSuccess = false;
					}*/
					
		
				}
				catch (Exception e) {
					/** logger class messege **/
					LOGGER.log(Level.SEVERE, e.getMessage());
				}
				
				return isSuccess;
	}
	
	public static boolean removeClerk(String id) {
		
		boolean isSuccess = false;
				
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					
					String sql = "DELETE FROM clerk WHERE empId = '"+id+"' ";
					
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
