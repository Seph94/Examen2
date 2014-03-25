package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pelotita extends Image{
	public Pelotita(int x,int y, Texture t) {
		//super(new Texture("data/corazon.png"));
		super(t);
		this.addListener(new MiInput(this));
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public void act(float delta)
	{
		setX(getX()+1);
	
		if(getX()>500)
		{
			setX(0);
			

}
}}