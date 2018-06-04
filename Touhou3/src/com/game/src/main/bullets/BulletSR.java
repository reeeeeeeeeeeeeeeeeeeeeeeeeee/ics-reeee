package com.game.src.main.bullets;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.GameObject;
import com.game.src.main.GameObjectBullets;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityC;
import com.game.src.main.graphics.Textures;

public class BulletSR extends GameObjectBullets implements EntityC {

	private int movePattern;
	
	public BulletSR(double x, double y, Textures tex, Player p, Controller c, int movePattern) {
		super(x,y,tex,p,c,movePattern);
		aim();
	}
	
	
	
	public void tick() {
			bound();
			counter++;
			
													
			
			move();	
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,64,64);
	}

	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g; 
		g2d.rotate(getAngle(),x+32,y+32);
		g.drawImage(tex.bulletSR, (int)x, (int)y, null);
        g2d.rotate(-getAngle(),x+32,y+32);
	
	
	
	}
	
	public double getY() {

		

		return y;
	}
	
	public double getX() {

		

		return x;
	}
	
	public void bound() {

		

		if(x<0 || y<0 || x>Game.WIDTH*2|| y>Game.HEIGHT*2)
			c.removeEntityC(this);
	}

	

	public void setXVel(double d) {

		xVel=d;
		
	}

	@Override
	public void setYVel(double d) {
		yVel=d;
		
	}

	@Override
	public int getCounter() {
		return counter;
	}
	
	public void aim() {
		xVel=-(x-p.getX())*8/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5));
		yVel=-(y-p.getY())*8/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5));
	}

}
