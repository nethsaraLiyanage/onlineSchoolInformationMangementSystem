package com.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.database.DBConnect;

public class SubjectDBUtil {
	
	//creating objects from dbconnect class
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	/** Initialize logger */
	private static final Logger LOGGER = Logger.getLogger(SubjectDBUtil.class.getName());

	public static boolean insertSubject(String subName, String grade, String periods) {
		// TODO Auto-generated method stub
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			 
			//String sql = "insert into Teacher values (0, '"+empName+"', '"+address+"','"+contactNo+"', '"+email+"', '"+userName+"', '"+password+"', '"+status+"', '"+level+"', 'admin')";
			
			
			PreparedStatement pstmt = con.prepareStatement("insert into subject values(?,?,?,?)");
			
			pstmt.setString(1,null);
			pstmt.setString(2,subName);
			pstmt.setString(3,grade);
			pstmt.setString(4,periods);
			
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
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	
	public static boolean removeSubject(String id) {
		
		boolean isSuccess = false;
				
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					
					String sql = "DELETE FROM subject WHERE subjectNo = '"+id+"' ";
					
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
