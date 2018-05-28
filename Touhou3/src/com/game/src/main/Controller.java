package com.game.src.main;

import java.awt.Graphics;
import java.util.LinkedList;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;
import com.game.src.main.enemies.Gilgamesh;
import com.game.src.main.enemies.Humunculus;
import com.game.src.main.graphics.Textures;
import com.game.src.main.waves.Wave1;

public class Controller extends Wave1{

	
	private LinkedList<EntityA> ea = new LinkedList<EntityA>();
	private LinkedList<EntityB> eb = new LinkedList<EntityB>();
	private LinkedList<EntityC> ec = new LinkedList<EntityC>();
	private LinkedList<EntityD> ed = new LinkedList<EntityD>();
	EntityA enta;
	EntityB entb;
	EntityC entc;
	EntityD entd;
	Player p;
	Game game;	
	Textures tex;
	private int ticks;
	private int seconds;
	
	public Controller(Game game, Textures tex, Player p) {
		this.game = game;
		this.tex = tex;
		this.p=p;
		
		ticks=0;
		seconds=0;
	}
	

	
	public void tick() {
		ticks++;
		if(ticks==60) {
			seconds++;
			ticks=0;
		}
		spawnEnemy(this, tex, game,p);
		//A Class
		for(int i=0; i<ea.size(); i++) {
			enta = ea.get(i);
			enta.tick();
		}
		//B Class
		for(int i=0; i<eb.size(); i++) {
			entb = eb.get(i);
			entb.tick();
		}
		//C Class
		for(int i=0; i<ec.size(); i++) {
			entc = ec.get(i);
			entc.tick();
		}
		//D Class
		for(int i=0; i<ed.size(); i++) {
			entd = ed.get(i);
			entd.tick();
		}
	}
	
	
	public void render(Graphics g) {
		//A Class
		for(int i=0; i<ea.size(); i++) {
			enta = ea.get(i);
			enta.render(g);
		}
		//B Class
		for(int i=0; i<eb.size(); i++) {
			entb = eb.get(i);
			entb.render(g);
		}
		//C Class
		for(int i=0; i<ec.size(); i++) {
			entc = ec.get(i);
			entc.render(g);
		}
		//D Class
		for(int i=0; i<ed.size(); i++) {
			entd = ed.get(i);
			entd.render(g);
		}
	}
	
	public void addEntityA(EntityA block) {
		ea.add(block);
	}
	public void removeEntityA(EntityA block) {
		ea.remove(block);
	}
	public void addEntityB(EntityB block) {
		eb.add(block);
	}
	public void removeEntityB(EntityB block) {
		eb.remove(block);
	}
	public void addEntityC(EntityC block) {
		ec.add(block);
	}
	public void removeEntityC(EntityC block) {
		ec.remove(block);
	}
	public void addEntityD(EntityD block) {
		ed.add(block);
	}
	public void removeEntityD(EntityD block) {
		ed.remove(block);
	}
	public LinkedList<EntityA> getEntityA(){
		return ea;
	}
	public LinkedList<EntityB> getEntityB(){
		return eb;
	}
	public LinkedList<EntityC> getEntityC(){
		return ec;
	}
	public LinkedList<EntityD> getEntityD(){
		return ed;
	}
	public int getSeconds(){
		return seconds;
	}


	public void removeAll() {
		while(0<eb.size()) {
			entb = eb.get(0);
			removeEntityB(entb);
		}	
		while(0<ec.size()) {
			entc = ec.get(0);
			removeEntityC(entc);
		}	
	}



	public int getTicks() {
		// TODO Auto-generated method stub
		return ticks;
	}




}
