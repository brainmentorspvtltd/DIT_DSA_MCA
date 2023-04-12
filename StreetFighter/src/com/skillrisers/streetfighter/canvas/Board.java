package com.skillrisers.streetfighter.canvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.skillrisers.streetfighter.sprites.Ken;
import com.skillrisers.streetfighter.sprites.Ryu;
import com.skillrisers.streetfighter.utils.Constants;

public class Board extends JPanel implements Constants {
	
	BufferedImage imageBg;
	private Ryu ryu;
	private Ken ken;
	private Timer timer;
	
	public Board() throws IOException {
		ryu = new Ryu();
		ken = new Ken();
		setFocusable(true);
		loadBackground();
		bindEvents();
		gameLoop();
	}
	
//	@Override
//	protected void paintComponent(Graphics pen) {
//		super.paintComponent(pen);
//		pen.setColor(Color.RED);
//		pen.fillRect(10, 10, 100, 100);
//		pen.setColor(Color.GREEN);
//		pen.drawOval(200, 200, 100, 100);
//		pen.fillOval(200, 200, 100, 100);
//	}
	
	
	private void gameLoop() {
		timer = new Timer(200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		showBackground(g);
		ryu.showPlayer(g);
		ken.showPlayer(g);
	}
	
	private void showBackground(Graphics pen) {
		pen.drawImage(imageBg, 0, 0, SCREENWDITH, SCREENHEIGHT, null);
	}
	
	private void loadBackground() throws IOException {
		imageBg = ImageIO.read(Board.class.getResource(BACKGROUND_IMAGE));
	}
	
	void bindEvents() {
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.println("Key Typed..." + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println("Key Released..." + e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println("Key Pressed..." + e.getKeyCode());
				// Ryu Movement
				if(e.getKeyCode() == KeyEvent.VK_A) {
					ryu.setSpeed(-SPEED);
					ryu.move();
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_D) {
					ryu.setSpeed(SPEED);
					ryu.move();
					//repaint();
				}
				
				// Ken Movement
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					ken.setSpeed(-SPEED);
					ken.move();
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					ken.setSpeed(SPEED);
					ken.move();
					//repaint();
				}
			}
		});
	}
	
}
