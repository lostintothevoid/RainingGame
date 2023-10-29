package com.mygdx.game;

import java.util.Random;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public class Meteorito extends Elemento{
	private float velocidadX;
	private float velocidadY;
	private int direccion;

public Meteorito() {
	super();
    velocidadX = 300 * Gdx.graphics.getDeltaTime();
    velocidadY = 300 * Gdx.graphics.getDeltaTime();
    dibujo = new Texture(Gdx.files.internal("meteorito.png"));
    sonido = Gdx.audio.newSound(Gdx.files.internal("kbooooom.mp3"));
    
    Random random = new Random();
    boolean esUno = random.nextBoolean();
    if(esUno) {
    	direccion = 1;
    }
    else {
    	direccion = -1;
    }
}

	public boolean choca(Tarro tarro) {
		if(hitbox.overlaps(tarro.getArea())) {
			efecto(tarro);
			return true;
		}
		else {
			return false;
		}
	}
	
	protected void efecto(Tarro tarro) {
		sonido.play();
		tarro.explosion();
	}
	
	public boolean movimiento() {
		
		setY(hitbox.y - getVelocidadY());
		setX(hitbox.x - getVelocidadX()*direccion);
		if(getY() + 64 < 0) {
	  	  return false;
	    }
		else {
			return true;
		}
	}
	
	public float getVelocidadY() {
		velocidadY = 400 * Gdx.graphics.getDeltaTime();
		return velocidadY;
	}
	public float getVelocidadX() {
		velocidadX = 50 * Gdx.graphics.getDeltaTime();
		return velocidadX;
	}
	
}