package com.game.src.main.graphics;

import java.awt.image.BufferedImage;

import com.game.src.main.Game;

public class Textures {

	public BufferedImage player, bullet, excalibah, gilgamesh, gayOfBabylon, gilsword, bulletSR, bulletSR2, loliSword, humunculus, cu, cu1,boneyBoy , medeaBallGreen,medea, kotomine, kotomineb, kotomineq, kotominea, jesus, key, keyb, keyq, keya, keyjesus, hagae, gilgameshBoss;
	public BufferedImage[] playerAni = new BufferedImage[4];

	private SpriteSheet ss;
	
	public Textures(Game game) {
		ss = new SpriteSheet(game.getSpriteSheet());
	
		getTextures();
	}
	
	public void getTextures() {
		player = ss.getImage(1, 1, 64, 64);
		bullet = ss.getImage(1, 5, 64, 64);
		excalibah = ss.getImage(17, 1, 512, 1024);
		gilgamesh = ss.getImage(2, 2, 64, 64);
		gayOfBabylon = ss.getImage(2, 4, 64, 64);
		gilsword = ss.getImage(2, 5+(int)(2*Math.random()), 64, 64);
		loliSword = ss.getImage(8, 2, 64, 64);
		bulletSR = ss.getImage(8, 3, 64, 64);
		bulletSR2 = ss.getImage(8, 4, 64, 64);
		humunculus = ss.getImage(8,1,64,64);
		cu = ss.getImage(3, 3, 64, 64);
		cu1 = ss.getImage(3, 4, 64, 64);
		hagae = ss.getImage(3, 6, 64, 64);
		boneyBoy = ss.getImage(9,1,64,64);
		medeaBallGreen = ss.getImage(7, 2, 64, 64);
		medea = ss.getImage(7, 1, 64, 64);
		kotomine = ss.getImage(16, 1, 64, 64);
		kotomineb = ss.getImage(16, 2, 64, 64);
		kotomineq = ss.getImage(16, 3, 64, 64);
		kotominea = ss.getImage(16, 4, 64, 64);
		jesus = ss.getImage(16, 5, 64, 64);
		key = ss.getImage(16,6,64,64);
		keyb = ss.getImage(16,7,64,64);
		keyq = ss.getImage(16,8,64,64);
		keya = ss.getImage(16,9,64,64);
		keyjesus = ss.getImage(16,2,64,64);
		gilgameshBoss = ss.getImage(2, 1, 64, 64);
		for(int i = 0; i<playerAni.length; i++) {
			playerAni[i] = ss.getImage(1, i+1, 64, 64);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
