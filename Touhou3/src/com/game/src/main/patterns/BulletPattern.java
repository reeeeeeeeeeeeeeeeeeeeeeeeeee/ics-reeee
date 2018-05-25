package com.game.src.main.patterns;

import com.game.src.main.Controller;
import com.game.src.main.Player;
import com.game.src.main.bullets.BulletSR;
import com.game.src.main.bullets.GaeBulge;
import com.game.src.main.bullets.MedeaBallGreen;
import com.game.src.main.bullets.Rejoice;
import com.game.src.main.classes.EntityB;
import com.game.src.main.graphics.Textures;

public class BulletPattern {
	//1
	public void aim1SR(EntityB b, Textures tex, Player p, Controller c) {
		if(b.getCounter()%60==0) {
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
		if(b.getCounter()%60==0) {
			c.addEntityC(new GaeBulge(b.getX(),b.getY(),tex, p,c, 0));
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
}