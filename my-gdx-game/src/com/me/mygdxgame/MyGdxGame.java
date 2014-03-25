package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

class Imagen extends Sprite
{
	Imagen(Texture texture)
	{
		super(texture);
	}
	InputListener l;
	void avanzar()
	{
		setX(getX()+0.01f);
		if(getX()>0.5f)
			setX(-0.5f);
	}
	
}

public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Texture texture_nave;
	private Sprite sprite;
	private Sprite sprite2;
	private Sprite sprite_nave;
	
	private Imagen imagen;
	private Image i;
	private Texture salir;
	private Salida salida;
	Pelotita p;
	ArrayList<Pelotita> pelotitas=new ArrayList<Pelotita>();
	Stage s;
	ArrayList<Sprite>sprites=new ArrayList<Sprite>();
	
	int rotacion=0;
	int frame=0;
	
	@Override
	public void create()
	{		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		
		texture = new Texture(Gdx.files.internal("data/fondoAzul.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		sprite = new Sprite(region);
		sprite2 = new Sprite(region);
		sprite2.setPosition(0,-0.5f);
		sprite2.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0,0);
		sprite.setRotation(25);
		
		
		texture_nave = new Texture(Gdx.files.internal("data/verde.png"));
		sprite_nave=new Sprite(texture_nave,64,64);
		sprite_nave.setPosition(-0.5f,-0.5f);
		sprite_nave.setSize(0.5f, 0.50f);
		
		salir = new Texture(Gdx.files.internal("data/Adios.png"));
		//fin.setVisible(false);
		
		imagen = new Imagen(texture);
		imagen.setPosition(-0.5f,-0.5f);
		//imagen.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		imagen.setSize(1.0f, 1.0f);
		
		s=new Stage();
		i=new Image(texture);
		s.addActor(i);
		
		Entrada ib = new Entrada ();
		s.addActor(ib);
		
		salida = new Salida ();
		s.addActor(salida);
		salida.setVisible(false);
		
		for(int i=0;i<3;i++)
		{
			sprites.add(new Sprite(texture));
			sprites.get(i).setX(i*0.2f-0.5f);
			sprites.get(i).setY(i*-0.2f-0.5f);
			sprites.get(i).setSize(1, 1);
		}
		
		for(int i=0;i<15;i++)
		{
			Pelotita p=new Pelotita((int)(Math.random()*1000%w),(int)(Math.random()*1000%h),new Texture("data/Amarillo.png"));
			
			s.addActor(p);
			pelotitas.add(p);
		}
		Gdx.input.setInputProcessor(s);
		
		
		for(int i=0;i<10;i++)
		{
			PelotitaMala p=new PelotitaMala((int)(Math.random()*1000%w),(int)(Math.random()*1000%h),salida);
			s.addActor(p);
			pelotitas.add(p);
		}
		Gdx.input.setInputProcessor(s);
		
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {	
		sprite.setRotation(rotacion);
		imagen.avanzar();
		
		/*if (frame%100==0){
		s.addActor(new Pelotita(0,0));
		frame++;}/*/
		if(!Pause.pausado)
		{
		s.act();
		
		}
		
		Gdx.gl.glClearColor(6.14f, 3.5f, 4.55f, 6);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		
		s.draw();
	
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public void resume() {
	}
}
