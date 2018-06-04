package com.game.src.main.bullets;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.GameObjectBullets;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityC;
import com.game.src.main.graphics.Textures;

public class MedeaBallGreen extends GameObjectBullets implements EntityC{

	private int movePattern;
	public MedeaBallGreen(double x, double y, Textures tex, Player p, Controller c, int movePattern) {
		super(x,y,tex,p,c, movePattern);
		this.movePattern=movePattern;
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
		g.drawImage(tex.medeaBallGreen, (int)x, (int)y, null);
	}
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}



	@Override
	public void bound() {
		if(x<50 || y<50 || x>Game.WIDTH*2-50|| y>Game.HEIGHT*2-50)
			c.removeEntityC(this);
	}



	@Override
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
		xVel=(x-p.getX())*5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5));
		yVel=(y-p.getY())*(5/(Math.pow(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2),0.5)));
	}





}
