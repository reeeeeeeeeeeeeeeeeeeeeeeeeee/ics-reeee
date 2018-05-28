package com.game.src.main.music;

import java.applet.*;
import java.net.URL;

public class Gay {

	
	URL gas = Music.class.getResource("/gay.wav");
	AudioClip clip = Applet.newAudioClip(gas);
	
	public Gay(){


				clip.play();


	}

}