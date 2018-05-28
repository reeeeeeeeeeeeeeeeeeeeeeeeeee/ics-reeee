package com.game.src.main.classes;

import java.awt.Graphics;
import java.awt.Rectangle;

public interface EntityD {
	public void tick();
	public void checkEnemyCollision();
	public void checkEnemyBulletCollision();
	public void render(Graphics g);
	public Rectangle getBounds();
	public double getX();
	public double getY();
	public void bound();
	
}
