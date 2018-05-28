package com.game.src.main;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;
import com.game.src.main.classes.EntityC;
import com.game.src.main.classes.EntityD;

public class Physics {

	public static boolean Collision(EntityA enta, EntityB entb) {
		
		 
			if(enta.getBounds().intersects(entb.getBounds())) {
				return true;
			}
		
		
		return false;
		
	}
	public static boolean Collision1(EntityD entd, EntityB entb) {
		
		 
		if(entd.getBounds().intersects(entb.getBounds())) {
			return true;
		}
	
	
	return false;
	
	}
	public static boolean Collision2(EntityD entd, EntityC entc) {
		
		 
		if(entd.getBounds().intersects(entc.getBounds())) {
			System.out.println("true");
			return true;
		}
	
	
	return false;
	
	}
	
	
	public static boolean Collision(EntityB entb, EntityA enta) {
		
			if(entb.getBounds().intersects(enta.getBounds())) {
				return true;
			
		}
		
		return false;
		
	}
}
