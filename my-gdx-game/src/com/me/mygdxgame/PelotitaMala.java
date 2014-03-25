package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;

public class PelotitaMala extends Pelotita{
	
	public PelotitaMala(int x, int y, Salida s)
	{
		super(x,y, new Texture("data/verde.png"));
		this.addListener(new MiInputMala(this,s));
		this.setX(x);
		this.setY(y);
	}

}
