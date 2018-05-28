package com.game.src.main;

import com.game.src.main.classes.EntityE;
import com.game.src.main.graphics.Textures;

public class GameObjectEnemyBoss extends GameObjectEnemies implements EntityE{
	private int hp;
	public GameObjectEnemyBoss(double x, double y, Textures tex, Player p, Controller c, int bulletPattern,
			int movePattern, int hp) {
		super(x, y, tex, p, c, bulletPattern, movePattern);
		this.hp=hp;
	}

	public void bound() {
		if(x<0 || y<0 || x>Game.WIDTH*2|| y>Game.HEIGHT*2 || hp<=0)
			c.removeEntityE(this);
	}

	@Override
	public void setHp(int hp) {
		this.hp=hp;
		
	}

	@Override
	public int getHp() {
		return hp;
	}
}
