package com.bmpl.chat.dao;

import java.sql.Connection;

public class ChatDAO {
	public Connection createConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return null;
	}
}
