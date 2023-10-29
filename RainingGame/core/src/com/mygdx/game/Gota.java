package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public abstract class Gota extends Elemento{
	private float velocidad;

	public Gota() {
		super();
		velocidad = 300 * Gdx.graphics.getDeltaTime();
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
	
	public boolean movimiento() {
		setY(hitbox.y - getVelocidad());
		if(getY() + 64 < 0) {
	  	  return false;
	    }
		else {
			return true;
		}
	}
	
	public float getVelocidad() {
		velocidad = 300 * Gdx.graphics.getDeltaTime();
		return velocidad;
	}
	
	
}