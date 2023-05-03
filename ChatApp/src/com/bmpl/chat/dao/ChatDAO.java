package com.bmpl.chat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChatDAO {
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/chat_db";
		final String USER_ID = "root";
		final String PASSWORD = "root";
		
		Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_ID, PASSWORD);
		if(con != null) {
			System.out.println("Connection created successfully...");
			//con.close();
		}
		
		return con;
	}
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		ChatDAO dao = new ChatDAO();
//		dao.createConnection();
//	}
}
