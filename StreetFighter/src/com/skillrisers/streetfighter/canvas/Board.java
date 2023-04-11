package com.skillrisers.streetfighter.canvas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.skillrisers.streetfighter.sprites.Ryu;
import com.skillrisers.streetfighter.utils.Constants;

public class Board extends JPanel implements Constants {
	
	BufferedImage imageBg;
	private Ryu ryu;
	
	public Board() throws IOException {
		ryu = new Ryu();
		loadBackground();
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
	
	@Override
	protected void paintComponent(Graphics g) {
		showBackground(g);
		ryu.showPlayer(g);
	}
	
	private void showBackground(Graphics pen) {
		pen.drawImage(imageBg, 0, 0, SCREENWDITH, SCREENHEIGHT, null);
	}
	
	private void loadBackground() throws IOException {
		imageBg = ImageIO.read(Board.class.getResource(BACKGROUND_IMAGE));
	}
	
}
