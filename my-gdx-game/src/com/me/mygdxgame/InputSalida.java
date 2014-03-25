package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputSalida extends InputListener{
	Salida F;
	
	InputSalida(Salida param)
	{
		super();
		F=param;
	}
	

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		F.setVisible(false);
		return true;

}
}
