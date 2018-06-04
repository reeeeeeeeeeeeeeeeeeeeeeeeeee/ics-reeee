package com.game.src.main;

import java.awt.Rectangle;

import com.game.src.main.graphics.Textures;
import com.game.src.main.patterns.MovementPattern;

public class GameObject extends MovementPattern {
	public double x,y,xVel,yVel ;
	public Textures tex;
	public Player p;
	public int counter;
	public Controller c;
	public GameObject(double x, double y, Textures tex, Player p, Controller c) {
		this.x=x;
		this.y=y;
		this.tex = tex;
		this.p = p;
		this.c = c;
		counter = 0;
	}
	public double getAngle() {
        double n = +Math.atan(yVel/xVel);
        if (xVel < 0 && yVel > 0) n= -Math.PI + n;
        if (xVel < 0 && yVel < 0) n = Math.PI + n;
        if (xVel > 0 && yVel < 0) n = -2*Math.PI + n;
        return n-Math.PI/2;
    }
	
	public Rectangle getBounds(int width, int height) {
		return new Rectangle((int)x,(int)y,width,height);
	}
}
