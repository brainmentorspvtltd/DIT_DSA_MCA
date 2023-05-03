package com.bmpl.chat.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JTextField;

import com.bmpl.chat.dao.UserDAO;
import com.bmpl.chat.dto.UserDTO;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class UserScreen {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		UserScreen window = new UserScreen();
		window.frame.setVisible(true);
	}

	public UserScreen() {
		frame = new JFrame();
		frame.setBounds(100, 100, 945, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login User");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(334, 11, 438, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(59, 155, 314, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter User Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(59, 246, 314, 46);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(390, 155, 382, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(390, 246, 382, 46);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(107, 428, 291, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(437, 428, 291, 53);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		
	}
	
	private void register() {
		String user_id = textField.getText();
		//String user_pwd = passwordField.getText();
		char[] password = passwordField.getPassword();
		
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO(user_id, password);
		try {
			int result = userDAO.doRegister(userDTO);
			if(result > 0) {
				JOptionPane.showMessageDialog(frame, "Registered Successfully");
			}
			else {
				JOptionPane.showMessageDialog(frame, "Registration Failed");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}
	
	private void login() {
		String user_id = textField.getText();
		//String user_pwd = passwordField.getText();
		char[] password = passwordField.getPassword();
		
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO(user_id, password);
		try {
			if(userDAO.doLogin(userDTO)) {
				JOptionPane.showMessageDialog(frame, "Login Success");
			}
			else {
				JOptionPane.showMessageDialog(frame, "Login Failed");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}
