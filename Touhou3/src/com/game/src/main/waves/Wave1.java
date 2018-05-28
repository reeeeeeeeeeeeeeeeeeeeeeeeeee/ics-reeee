package com.game.src.main.waves;

import com.game.src.main.Controller;
import com.game.src.main.Game;
import com.game.src.main.Player;
import com.game.src.main.enemies.BoneyBoi;
import com.game.src.main.enemies.CuChulainn;
import com.game.src.main.enemies.DontSpookMeKirei;
import com.game.src.main.enemies.DontSpookMeKirei1;
import com.game.src.main.enemies.DontSpookMeKirei2;
import com.game.src.main.enemies.DontSpookMeKirei3;
import com.game.src.main.enemies.Humunculus;
import com.game.src.main.enemies.Jesus;
import com.game.src.main.graphics.Textures;

public class Wave1 {

	public void spawnEnemy(Controller c, Textures tex, Game game, Player p) {
		if(c.getSeconds()%5==0 && c.getTicks()==0) {
			for(int x = 0; x<c.getSeconds()/2; x++) {
				c.addEntityB(new CuChulainn(Game.WIDTH*Game.SCALE*Math.random(),0.0, tex, p,c,3,1));
			}
		}
		if(c.getSeconds()==15 && c.getTicks()==0) {
			for(int x = 0; x<3; x++) {
				c.addEntityB(new BoneyBoi(Game.WIDTH*Game.SCALE*Math.random(),0.0, tex, p,c,1,1));
			}
		}
		if(c.getSeconds()==5 && c.getTicks()==0) {
			for(int x = 0; x<(Game.WIDTH*Game.SCALE); x+=64) {
				c.addEntityB(new Humunculus(x,0.0, tex, p,c,2,1));
			}
		}
		/*if(c.getSeconds()==1 && c.getTicks()==0) {
			for(int x = 0; x<(Game.WIDTH*Game.SCALE); x+=64) {
				c.addEntityB(new Medea(x,0.0, tex,p,c,2,1));
			}
		}*/
		if(c.getSeconds()==1 && c.getTicks()==0) {
			c.addEntityB(new DontSpookMeKirei(Game.WIDTH*Game.SCALE*Math.random(),0.0, tex, p,c,69,1));
		}
		if(c.getSeconds()==1 && c.getTicks()==0) {
			c.addEntityB(new DontSpookMeKirei1(Game.WIDTH*Game.SCALE*Math.random(),0.0, tex, p,c,69,1));
		}
		if(c.getSeconds()==1 && c.getTicks()==0) {
			c.addEntityB(new DontSpookMeKirei2(Game.WIDTH*Game.SCALE*Math.random(),0.0, tex, p,c,69,1));
		}
		if(c.getSeconds()==1 && c.getTicks()==0) {
			c.addEntityB(new DontSpookMeKirei3(Game.WIDTH*Game.SCALE*Math.random(),0.0, tex, p,c,69,1));
		}
		if(c.getSeconds()==1 && c.getTicks()==0) {
			c.addEntityB(new Jesus(Game.WIDTH*Game.SCALE*Math.random(),0.0, tex, p,c,69,1));
		}

	}
	
	
	
	
	
	
}
