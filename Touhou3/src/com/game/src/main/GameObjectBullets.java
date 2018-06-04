package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.classes.EntityB;
import com.game.src.main.graphics.Textures;

public class GameObjectBullets extends GameObject implements EntityB{
	public int movePattern;
	public GameObjectBullets(double x, double y, Textures tex, Player p, Controller c, int movePattern) {
		super(x, y, tex, p, c);
	
		this.movePattern = movePattern;
		
	}
	
	public void move() {
		if(movePattern==1)			down1(this);
		else if(movePattern==2)		down2(this);
		else if(movePattern==3)		down3(this);
		else if(movePattern==4)		down4(this);
		else if(movePattern==5)		down5(this);
		else if(movePattern==6)		up1(this);
		else if(movePattern==7)		up2(this);
		else if(movePattern==8)		up3(this);
		else if(movePattern==9)		up4(this);
		else if(movePattern==10)	up5(this);
		else if(movePattern==11)	left1(this);
		else if(movePattern==12)	left2(this);
		else if(movePattern==13)	left3(this);
		else if(movePattern==14)	left4(this);
		else if(movePattern==15)	left5(this);
		else if(movePattern==16)	right1(this);
		else if(movePattern==17)	right2(this);
		else if(movePattern==18)	right3(this);		
		else if(movePattern==19)	right4(this);
		else if(movePattern==20)	right5(this);				
		else if(movePattern==21)	zigzag1(this);													
		else if(movePattern==22)	zigzag2(this);		
		else if(movePattern==23)	zigzag3(this);		
		else if(movePattern==24)	downleft1(this);			
		else if(movePattern==25)	downleft2(this);		
		else if(movePattern==26)	downleft3(this);		
		else if(movePattern==27)	downleft4(this);		
		else if(movePattern==28)	downleft5(this);		
		else if(movePattern==29)	downright1(this);

		x+=xVel;
		y+=yVel;
		
	}	
	public void tick() {
		bound();
		move();
		counter++;

		if(counter==720) {
			counter=0;
		}
	}
	public void resetCounter(){
		if(counter==720)	counter=0;
	}
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,20,20);
	}
	
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}
	public int getCounter(){
		return counter;
	}
	public void setCounter(int counter){
		this.counter = counter;
	}


	@Override
	public void bound() {
		if(x<0 || y<0 || x>Game.WIDTH*2|| y>Game.HEIGHT*2)
			c.removeEntityB(this);
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
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}	

}
