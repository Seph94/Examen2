package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputPause extends InputListener {
	Pause stop;
	
	InputPause(Pause a)
	{
		super();
		stop = a;
		
	}
	

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
	
		Pause.pausado =!Pause.pausado;

	
		return false;
}	

}
