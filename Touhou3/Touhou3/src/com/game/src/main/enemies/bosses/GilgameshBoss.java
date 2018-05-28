package com.game.src.main.enemies.bosses;

import java.awt.Graphics;

import com.game.src.main.Controller;
import com.game.src.main.GameObjectEnemyBoss;
import com.game.src.main.Player;
import com.game.src.main.classes.EntityE;
import com.game.src.main.graphics.Textures;

public class GilgameshBoss extends GameObjectEnemyBoss implements EntityE {

	public GilgameshBoss(double x, double y, Textures tex, Player p, Controller c, int bulletPattern, int movePattern,
			int hp) {
		super(x, y, tex, p, c, bulletPattern, movePattern, hp);
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
		g.drawImage(tex.gilgameshBoss, (int)x,(int)y, null);
	}
}
