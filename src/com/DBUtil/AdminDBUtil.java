package com.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.database.DBConnect;
import com.model.Login;

public class AdminDBUtil {
	
	private static Connection con;
	private static PreparedStatement stmt;
	private static ResultSet rs;
	
	/** Initialize logger */
	private static final Logger LOGGER = Logger.getLogger(AdminDBUtil.class.getName());

	public Login getData(String usernameSt, String passwordSt) {
		

		
		Login login = new Login();
		
		try {
			
			con = DBConnect.getConnection();
			//stmt = con.createStatement();
			
			stmt = con.prepareStatement("SELECT userName, password, empId FROM admin WHERE userName = ? and password = ?");
			stmt.setString(1,usernameSt);
			stmt.setString(2,passwordSt);
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				login.setUsernameSt(rs.getString("userName"));
				login.setPasswordSt(rs.getString("password"));
				login.setEmpNoSt(rs.getInt("empId"));
				
			}
			
		}catch(Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return login;
	}
}
