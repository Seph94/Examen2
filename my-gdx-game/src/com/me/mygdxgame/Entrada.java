package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Entrada extends Image {
	
	Image Inicio;
	
	public Entrada()
	{
		super(new Texture("data/fondo.png"));
		addListener(new InputEntrada(this));		
	}
	
	

}
