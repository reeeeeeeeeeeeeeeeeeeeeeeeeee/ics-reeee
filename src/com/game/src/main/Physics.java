package com.game.src.main;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;
import com.game.src.main.classes.EntityE;

public class Physics {

	public static boolean CollisionAB(EntityA enta, EntityB entb) {
		 
			if(enta.getBounds().intersects(entb.getBounds())) {
				return true;
			}
		
		
		return false;
		
	}
	public static boolean CollisionDB(EntityD entd, EntityB entb) {
		
		 
		if(entd.getBounds().intersects(entb.getBounds())) {
			return true;
		}
	
	
	return false;
	
	}
	public static boolean CollisionDC(EntityD entd, EntityC entc) {
		
		 
		if(entd.getBounds().intersects(entc.getBounds())) {
			return true;
		}
	
	
	return false;
	
	}
	
	
	public static boolean CollisionBA(EntityB entb, EntityA enta) {
		
			if(entb.getBounds().intersects(enta.getBounds())) {
				return true;
			
		}
		
		return false;
		
	}

	public static boolean CollisionAE(EntityA enta, EntityE ente) {
		
		if(enta.getBounds().intersects(ente.getBounds())) {
			return true;
		
		}
	
	return false;
	}



}
