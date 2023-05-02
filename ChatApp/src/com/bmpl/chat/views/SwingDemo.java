package com.bmpl.chat.views;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo extends JFrame{
	int counter;
	
	public SwingDemo() {
		counter = 0;
		setSize(700,600);
		setResizable(false);
		setTitle("Chat Application");
		setLocationRelativeTo(null);
		
		JLabel title = new JLabel("Welcome to Chat App...");
		title.setFont(new Font("Arial", Font.BOLD, 30));
		title.setBounds(100,20,500,50);
		
		JLabel counterLabel = new JLabel("0");
		counterLabel.setFont(new Font("Arial", Font.BOLD, 30));
		counterLabel.setBounds(400,120,100,50);
		
		JButton btn = new JButton("Increment");
		btn.setFont(new Font("Arial", Font.BOLD, 25));
		btn.setBounds(100,120,200,50);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				counterLabel.setText(""+counter);
			}
		});
		
		Container container = this.getContentPane();
		container.setLayout(null);
		container.add(title);
		container.add(counterLabel);
		container.add(btn);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingDemo obj = new SwingDemo();
	}

}
