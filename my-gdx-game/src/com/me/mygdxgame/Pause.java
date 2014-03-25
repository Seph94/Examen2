package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class Pause extends Image {
	
	static boolean pausado = false;
	public Pause ()
	{
		super(new Texture ("data/buton.png"));
		this.addListener(new InputPause(this));
	}
	
	
	

}
