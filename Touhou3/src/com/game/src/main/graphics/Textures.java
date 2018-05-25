package com.game.src.main.graphics;

import java.awt.image.BufferedImage;

import com.game.src.main.Game;

public class Textures {

	public BufferedImage player, bullet, gilgamesh, bulletSR, humunculus,cu,boneyBoy , medeaBallGreen,medea, kotomine, key,hagae;
	public BufferedImage[] playerAni = new BufferedImage[4];
	private SpriteSheet ss;
	
	public Textures(Game game) {
		ss = new SpriteSheet(game.getSpriteSheet());
	
		getTextures();
	}
	
	public void getTextures() {
		player = ss.getImage(1, 1, 64, 64);
		bullet = ss.getImage(1, 5, 64, 64);
		gilgamesh = ss.getImage(2, 2, 64, 64);
		bulletSR = ss.getImage(8, 3, 64, 64);
		humunculus = ss.getImage(8,1,64,64);
		cu = ss.getImage(3, 3, 64, 64);
		boneyBoy = ss.getImage(9,1,64,64);
		medeaBallGreen = ss.getImage(7, 2, 64, 64);
		medea = ss.getImage(7, 1, 64, 64);
		kotomine = ss.getImage(16, 1, 64, 64);
		key = ss.getImage(16,2,64,64);
		hagae = ss.getImage(3, 6, 64, 64);
		for(int i = 0; i<playerAni.length; i++) {
			playerAni[i] = ss.getImage(1, i+1, 64, 64);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
