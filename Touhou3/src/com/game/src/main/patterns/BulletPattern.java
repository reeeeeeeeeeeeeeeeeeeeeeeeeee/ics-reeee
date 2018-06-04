package com.game.src.main.patterns;

import com.game.src.main.Controller;
import com.game.src.main.Player;
import com.game.src.main.bullets.BulletSR;
import com.game.src.main.bullets.BulletSR2;
import com.game.src.main.bullets.GaeBulge;
import com.game.src.main.bullets.GilBullets;
import com.game.src.main.bullets.LoliSword;
import com.game.src.main.bullets.MedeaBallGreen;
import com.game.src.main.bullets.Rejoice;
import com.game.src.main.bullets.RejoiceA;
import com.game.src.main.bullets.RejoiceB;
import com.game.src.main.bullets.RejoiceQ;
import com.game.src.main.classes.EntityB;
import com.game.src.main.enemies.Gate;
import com.game.src.main.graphics.Textures;

public class BulletPattern {
	//1
	public void aim1SR(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%30==0) {
			c.addEntityC(new BulletSR(b.getX(),b.getY(),tex, p,c, 0));
		}
	}
	//2
	public void spread1(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%180==0) {
			c.addEntityC(new MedeaBallGreen(b.getX(),b.getY(),tex, p,c,2));
			c.addEntityC(new MedeaBallGreen(b.getX(),b.getY(),tex, p,c,7));
			c.addEntityC(new MedeaBallGreen(b.getX(),b.getY(),tex, p,c,12));
			c.addEntityC(new MedeaBallGreen(b.getX(),b.getY(),tex, p,c,17));
			c.addEntityC(new MedeaBallGreen(b.getX(),b.getY(),tex, p,c,24));
			c.addEntityC(new MedeaBallGreen(b.getX(),b.getY(),tex, p,c,29));
		}
	}
	//3
	public void gae(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%120==0) {
			c.addEntityC(new GaeBulge(b.getX(),b.getY(),tex, p,c, 0));
		}
	}
	//4
	public void GOB(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%10==0) {
			c.addEntityB(new Gate(b.getX()+(int)(15*Math.random()),b.getY(), tex, p,c,5,5));
		}
	}
	//5
	public void gatepew(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%60==0) {
			c.addEntityC(new GilBullets(b.getX(),b.getY(), tex, p,c,0));
		}	
	}
	//6
	public void aim2SR(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%120==0) {
			c.addEntityC(new BulletSR2(b.getX(),b.getY(),tex, p,c, 0));
		}
	}
	//7
	public void ilyasword(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%90==0) {
			c.addEntityC(new LoliSword(b.getX(),b.getY(),tex, p,c, 0));
			c.addEntityC(new LoliSword(b.getX(),b.getY(),tex, p,c, 0));
			c.addEntityC(new LoliSword(b.getX(),b.getY(),tex, p,c, 0));
			c.addEntityC(new LoliSword(b.getX(),b.getY(),tex, p,c, 0));
			c.addEntityC(new LoliSword(b.getX(),b.getY(),tex, p,c, 0));
		}
	}
	//69
	public void yorokobe(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%60==0) {
			c.addEntityC(new Rejoice(b.getX(),b.getY()+20,tex, p,c, 0));
			c.addEntityC(new Rejoice(b.getX(),b.getY()-20,tex, p,c, 0));
			c.addEntityC(new Rejoice(b.getX()-20,b.getY(),tex, p,c, 0));
		}
	}
	public void yorokobeB(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%60==0) {
			c.addEntityC(new RejoiceB(b.getX(),b.getY()+20,tex, p,c, 0));
			c.addEntityC(new RejoiceB(b.getX(),b.getY()-20,tex, p,c, 0));
			c.addEntityC(new RejoiceB(b.getX()-20,b.getY(),tex, p,c, 0));
		}
	}
	public void yorokobeQ(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%60==0) {
			c.addEntityC(new RejoiceQ(b.getX(),b.getY()+20,tex, p,c, 0));
			c.addEntityC(new RejoiceQ(b.getX(),b.getY()-20,tex, p,c, 0));
			c.addEntityC(new RejoiceQ(b.getX()-20,b.getY(),tex, p,c, 0));
		}
	}
	public void yorokobeA(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%60==0) {
			c.addEntityC(new RejoiceA(b.getX(),b.getY()+20,tex, p,c, 0));
			c.addEntityC(new RejoiceA(b.getX(),b.getY()-20,tex, p,c, 0));
			c.addEntityC(new RejoiceA(b.getX()-20,b.getY(),tex, p,c, 0));
		}
	}
}