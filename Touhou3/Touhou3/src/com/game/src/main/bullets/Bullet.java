package com.game.src.main.bullets;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.GameObject;
import com.game.src.main.Physics;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityE;
import com.game.src.main.graphics.Textures;

public class Bullet extends GameObject implements EntityA{

	Game game;
	
	public Bullet(double x, double y, Textures tex, Player p, Controller c, Game game) {
		super(x,y,tex,p,c);
		this.game = game;
	}
	
	
	public void tick() {
			bound();
			checkEnemyCollision();
			
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,10,10);
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.bullet, (int)x, (int)y, null);
	}
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}

	@Override
	public void checkEnemyCollision() {
		for(int i =0; i<game.eb.size();i++) {
			EntityB tempEnt = game.eb.get(i);
			if(Physics.Collision(this, tempEnt )) {
				c.removeEntityA(this);
				c.removeEntityB(tempEnt);
				p.setNP(p.getNP()+10);
			}
		}
		for(int i =0; i<game.ee.size();i++) {
			EntityE tempEnt = game.ee.get(i);
			if(Physics.CollisionAE(this, tempEnt )) {
				c.removeEntityA(this);
				c.setBoss(tempEnt);
				p.setNP(p.getNP()+10);
				
			}
		}
	}


	@Override
	public void bound() {
		if(y<0)
			c.removeEntityA(this);
		y-=10;
	}
}
