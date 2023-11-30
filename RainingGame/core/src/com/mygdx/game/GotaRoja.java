package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class GotaRoja extends Gota{
	
	public GotaRoja(Rectangle hitbox, Sound sonido, Texture dibujo, float velocidadX, float velocidadY) {
		super(hitbox, sonido, dibujo, velocidadX, velocidadY);
	}
	
	@Override
	protected void efecto(Tarro tarro) {
		tarro.dañar();
		getSound().play();
	}
}
