package com.mygdx.game;

import java.util.Random;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public class Meteorito extends Elemento{

	private int direccion;

public Meteorito(Rectangle hitbox, Sound sonido, Texture dibujo, float velocidadX, float velocidadY) {
	super(hitbox, sonido, dibujo, velocidadX, velocidadY);    
    
	Random random = new Random();
    boolean esUno = random.nextBoolean();
    if(esUno) {
    	direccion = 1;
    }
    else {
    	direccion = -1;
    }
}
//Choca tarro
	public boolean choca(Tarro tarro) {
		if(getHitbox().overlaps(tarro.getArea())) {
			efecto(tarro);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean movimiento() {
		
		setY(getHitbox().y - getVelocidadYMete());
		setX(getHitbox().x - getVelocidadXMete()*direccion);
		if(getY() + 64 < 0) {
	  	  return false;
	    }
		else {
			return true;
		}
	}
	
	protected void efecto(Tarro tarro) {
		getSound().play();
		tarro.explosion();
	}
	
	public float getVelocidadYMete() {
		setVelocidadY(400 * Gdx.graphics.getDeltaTime());
		return getVelocidadY();
	}
	public float getVelocidadXMete() {
		setVelocidadX(50 * Gdx.graphics.getDeltaTime());
		return getVelocidadX();
	}
	
}