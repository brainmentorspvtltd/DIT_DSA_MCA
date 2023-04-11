package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.skillrisers.streetfighter.utils.Constants;

public class Ryu extends JPanel implements Constants {
	
	BufferedImage playerImg;
	int x;
	int y;
	int w;
	int h;
	
	public Ryu() throws IOException {
		x = 300;
		w = 200;
		h = 250;
		y = SCREENHEIGHT - h - 100;
		loadPlayer();
	}
	
	public void showPlayer(Graphics pen) {
		pen.drawImage(playerImg, x, y, w, h, null);
	}
	
	private void loadPlayer() throws IOException {
		playerImg = ImageIO.read(Ryu.class.getResource(RYU_IMAGE));
		playerImg = playerImg.getSubimage(7, 11, 60, 93);
	}
	
}
