package com.game.src.main.bullets;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.GameObject;
import com.game.src.main.Physics;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;
import com.game.src.main.graphics.Textures;

public class Excalibur extends GameObject implements EntityD{

	Game game;
	
	public Excalibur(double x, double y, Textures tex, Player p, Controller c, Game game) {
		super(x,y,tex,p,c);
		this.game = game;
	}
	
	
	public void tick() {
			counter++;
			bound();
			checkEnemyCollision();
			checkEnemyBulletCollision();

	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y,256,Game.HEIGHT*2);
	}
	
	public void render(Graphics g) {
		g.drawImage(tex.excalibah, (int)x, (int)y, null);
	}
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}

	public void checkEnemyCollision() {
		for(int i =0; i<game.eb.size();i++) {
			EntityB tempEnt = game.eb.get(i);
			if(Physics.Collision1(this, tempEnt )) {
				c.removeEntityB(tempEnt);
			}
		}
	}
	public void checkEnemyBulletCollision() {
		for(int i =0; i<game.ec.size();i++) {
			EntityC tempEnt = game.ec.get(i);
			if(Physics.Collision2(this, tempEnt )) {
				c.removeEntityC(tempEnt);
			}
		}
	}


	@Override
	public void bound() {
		if(counter>=300)
			c.removeEntityD(this);
	}

}
