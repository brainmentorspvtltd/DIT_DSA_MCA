package com.skillrisers.streetfighter.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.skillrisers.streetfighter.utils.Constants;

public class Ryu extends CommonPlayer implements Constants {
	
	private BufferedImage idleImages[] = new BufferedImage[5];
	private BufferedImage walkImages[] = new BufferedImage[6];
	private BufferedImage punchImages[] = new BufferedImage[5];
	private BufferedImage kickImages[] = new BufferedImage[5];
	private BufferedImage powerImages[] = new BufferedImage[5];
	
	private int force;
	public Ryu() throws IOException {
		x = 300;
		w = 200;
		h = 250;
		y = SCREENHEIGHT - h - 100;
		speed = 0;
		force = 0;
		imageIndex = 0;
		playerImg = ImageIO.read(Ryu.class.getResource(RYU_IMAGE));
		loadIdleImages();
		loadWalkImages();
		loadPunchImages();
	}
	
	public void jump() {
		force = -40;
		y = y + force;
	}
	
	public void fall() {
		if(y + force > GROUND - h) {
			return;
		}
		force = force + GRAVITY;
		y = y + force;
	}
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(7, 11, 60, 93);
		idleImages[1] = playerImg.getSubimage(73, 12, 64, 92);
		idleImages[2] = playerImg.getSubimage(140, 12, 61, 92);
		idleImages[3] = playerImg.getSubimage(211, 9, 57, 95);
		idleImages[4] = playerImg.getSubimage(276, 9, 60, 95);
	}
	
	private void loadWalkImages() {
		walkImages[0] = playerImg.getSubimage(10, 135, 54, 86);
		walkImages[1] = playerImg.getSubimage(78, 130, 60, 91);
		walkImages[2] = playerImg.getSubimage(151, 126, 67, 95);
		walkImages[3] = playerImg.getSubimage(228, 126, 66, 95);
		walkImages[4] = playerImg.getSubimage(305, 126, 57, 95);
		walkImages[5] = playerImg.getSubimage(369, 126, 54, 95);
	}
	
	private void loadPunchImages() {
		punchImages[0] = playerImg.getSubimage(6, 465, 60, 96);
		punchImages[1] = playerImg.getSubimage(85, 465, 74, 96);
		punchImages[2] = playerImg.getSubimage(174, 465, 112, 96);
		punchImages[3] = playerImg.getSubimage(85, 465, 74, 96);
		punchImages[4] = playerImg.getSubimage(6, 465, 60, 96);
	}
	
	public BufferedImage printIdleImages() {
		if(imageIndex > 4) {
			imageIndex = 0;
		}
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printWalkImages() {
		if(imageIndex > 5) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = walkImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printPunchImages() {
		if(imageIndex > 4) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = punchImages[imageIndex];
		imageIndex++;
		return img;
	}

	@Override
	public BufferedImage defaultImage() {
		if(currentMove == WALK) {
			return printWalkImages();
		}
		else if(currentMove == PUNCH) {
			return printPunchImages();
		}
		else {
			return printIdleImages();
		}		
	}
	
//	private void loadPlayer() throws IOException {
//		playerImg = ImageIO.read(Ryu.class.getResource(RYU_IMAGE));
//		playerImg = playerImg.getSubimage(7, 11, 60, 93);
//	}
	
}
