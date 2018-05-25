package com.game.src.main.enemies;



import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.GameObject;
import com.game.src.main.GameObjectEnemies;
import com.game.src.main.Player;
import com.game.src.main.bullets.BulletSR;
import com.game.src.main.classes.EntityB;
import com.game.src.main.graphics.Textures;

public class BoneyBoi extends GameObjectEnemies implements EntityB{


	
	public BoneyBoi(double x, double y, Textures tex, Player p, Controller c,int bulletPattern, int movePattern) {
		super(x,y,tex,p,c,bulletPattern,movePattern);
	} 
	
	
	public void tick() {
		bound();
		move();
		counter++;
		if(counter==720) {
			counter=0;
		}
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.boneyBoy, (int)x,(int)y, null);
	}
}
