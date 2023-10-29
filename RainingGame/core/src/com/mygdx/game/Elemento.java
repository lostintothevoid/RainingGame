package com.mygdx.game;

import java.util.Random;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public abstract class Elemento implements Dibujable{
	protected Rectangle hitbox;
	protected Sound sonido;
	protected Texture dibujo;
	
	public Elemento() {
		hitbox = new Rectangle();
		hitbox.x = MathUtils.random(0, 800-64);
		hitbox.y = 480;
		hitbox.width = 64;
		hitbox.height = 64;
	}
	
	public abstract boolean choca(Tarro tarro);
	
	protected abstract void efecto(Tarro tarro);
	
	public abstract boolean movimiento();
	
	public void dibujar(SpriteBatch batch) {
		batch.draw(getTextura(), getX(), getY());
	}
	
	public float getY() {
		return hitbox.y;
	}
	public void setY(float actualizar) {
		hitbox.y = actualizar;
	}
	
	public float getX() {
		return hitbox.x;
	}
	public void setX(float actualizar) {
		hitbox.x = actualizar;
	}
	
	public Rectangle getRectangle() {
		return hitbox;
	}

	public void dispose() {
		sonido.dispose();
	}
	
	public Sound getSound() {
		return sonido;
	}
	
	public Texture getTextura() {
		return dibujo;
	}
}

