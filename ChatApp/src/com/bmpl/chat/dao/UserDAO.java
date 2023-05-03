package com.bmpl.chat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bmpl.chat.dto.UserDTO;
import com.mysql.cj.protocol.Resultset;

public class UserDAO {
	public int doRegister(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		
		conn = ChatDAO.createConnection();
		stmt = conn.createStatement();
		
		try {
			String userId = userDTO.getUserId();
			char []password = userDTO.getPassword();
			String pass = new String(password);
			String query = "insert into users values ('" + userId + "'," + "'" + pass + "')";
			//System.out.println(query);
			int record = stmt.executeUpdate(query);
			return record;
		}
		finally {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}	
	}
	
	public boolean doLogin(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String query = "select id from users where id=? and password=?";
		String userId = userDTO.getUserId();
		char []password = userDTO.getPassword();
		String pass = new String(password);
		try {
			conn = ChatDAO.createConnection();
			stmt = conn.prepareStatement(query);
			stmt.setString(1, userId);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			return rs.next();			
		}
		finally {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
	}
	
}
