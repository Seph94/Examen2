package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Salida extends Image {
	
	Image out;
	
	public Salida()
	{
		super(new Texture("data/Adios.png"));
		addListener(new InputSalida(this));
		
	}
	

} 
