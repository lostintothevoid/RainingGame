package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
public abstract class Gota extends Elemento{

	public Gota(Rectangle hitbox, Sound sonido, Texture dibujo, float velocidadX, float velocidadY) {
		super(hitbox, sonido, dibujo, velocidadX, velocidadY);

	}

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
		setY(getHitbox().y - getVelocidad());
		if(getY() + 64 < 0) {
	  	  return false;
	    }
		else {
			return true;
		}
	}
	
	public float getVelocidad() {
		setVelocidadY(300 * Gdx.graphics.getDeltaTime());
		return getVelocidadY();
	}
	
	
}