package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;

public class MiInputMala extends MiInput {
	Salida out;
	MiInputMala(Pelotita param,Salida Out){
		super(param);
		out = Out;
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
		out.setVisible(true);
		return true;
	}
	

}
