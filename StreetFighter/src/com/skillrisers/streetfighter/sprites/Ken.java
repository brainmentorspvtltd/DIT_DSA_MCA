package com.skillrisers.streetfighter.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.skillrisers.streetfighter.utils.Constants;

public class Ken extends CommonPlayer implements Constants {
	
	private BufferedImage idleImages[] = new BufferedImage[4];
	
	public Ken() throws IOException {
		x = SCREENWDITH - 400;
		w = 200;
		h = 250;
		y = SCREENHEIGHT - h - 100;
		speed = 0;
		playerImg = ImageIO.read(Ryu.class.getResource(KEN_IMAGE));
		loadIdleImages();
	}
	
//	private void loadPlayer() throws IOException {
//		playerImg = ImageIO.read(Ryu.class.getResource(KEN_IMAGE));
//		playerImg = playerImg.getSubimage(1347, 244, 114, 245);
//	}

	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(1347, 244, 114, 245);
		idleImages[1] = playerImg.getSubimage(1116, 240, 118, 249);
		idleImages[2] = playerImg.getSubimage(890, 242, 118, 247);
		idleImages[3] = playerImg.getSubimage(672, 242, 117, 247);
	}
	
	public BufferedImage printIdleImages() {
		if(imageIndex > 3) {
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
}
