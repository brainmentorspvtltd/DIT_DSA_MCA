package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.skillrisers.streetfighter.utils.Constants;

public class Ryu extends CommonPlayer implements Constants {
	
	private BufferedImage idleImages[] = new BufferedImage[5];
	
	public Ryu() throws IOException {
		x = 300;
		w = 200;
		h = 250;
		y = SCREENHEIGHT - h - 100;
		speed = 0;
		imageIndex = 0;
		playerImg = ImageIO.read(Ryu.class.getResource(RYU_IMAGE));
		loadIdleImages();
	}
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(7, 11, 60, 93);
		idleImages[1] = playerImg.getSubimage(73, 12, 64, 92);
		idleImages[2] = playerImg.getSubimage(140, 12, 61, 92);
		idleImages[3] = playerImg.getSubimage(211, 9, 57, 95);
		idleImages[4] = playerImg.getSubimage(276, 9, 60, 95);
	}
	
	public BufferedImage printIdleImages() {
		if(imageIndex > 4) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}

	@Override
	public BufferedImage defaultImage() {
		return printIdleImages();
	}
	
//	private void loadPlayer() throws IOException {
//		playerImg = ImageIO.read(Ryu.class.getResource(RYU_IMAGE));
//		playerImg = playerImg.getSubimage(7, 11, 60, 93);
//	}
	
}
