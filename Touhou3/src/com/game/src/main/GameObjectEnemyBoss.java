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
	public void pew() {
		if(bulletPattern==1)		aim1SR(this, tex, p,c);
		else if(bulletPattern==2)	spread1(this,tex,p,c);
		else if(bulletPattern==3)	gae(this,tex,p,c);
		else if(bulletPattern==4)	GOB(this,tex,p,c);
		else if(bulletPattern==5)	gatepew(this,tex,p,c);
		else if(bulletPattern==69)	yorokobe(this, tex, p,c);
		else if(bulletPattern==70)	yorokobeB(this, tex, p,c);
		else if(bulletPattern==71)	yorokobeQ(this, tex, p,c);
		else if(bulletPattern==72)	yorokobeA(this, tex, p,c);
		else						System.out.println("pew");
	}
	
}
