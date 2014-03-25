package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputEntrada extends InputListener {
	
	Entrada In;
	InputEntrada(Entrada param)
	{
		super();
		In=param;
	}
	

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		In.setVisible(false);
		return true;
	

}
}
