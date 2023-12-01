package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;public class GotaAzul extends Gota{
	
	
	public GotaAzul(Rectangle hitbox, Sound sonido, Texture dibujo, float velocidadX, float velocidadY) {
		super(hitbox, sonido, dibujo, velocidadX, velocidadY);
			
	}
	
	
	
	protected void efecto(Tarro tarro) {
		tarro.sumarPuntos(10);
        getSound().play();
	}
	
}
