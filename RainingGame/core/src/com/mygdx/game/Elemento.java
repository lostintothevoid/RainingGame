package com.mygdx.game;

import java.util.Random;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public abstract class Elemento implements Dibujable{
	private Rectangle hitbox;
	private Sound sonido;
	private Texture dibujo;
	private float velocidadX;
	private float velocidadY;
	
	public Elemento(Rectangle hitbox, Sound sonido, Texture dibujo, float velocidadX, float velocidadY) {
		this.hitbox = hitbox;
		this.sonido = sonido;
		this.dibujo = dibujo;
		this.velocidadX = velocidadX;
		this.velocidadY = velocidadY;
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
	
	protected Rectangle getHitbox() {
		return hitbox;
	}

	public void dispose() {
		sonido.dispose();
	}
	
	public Sound getSound() {
		return sonido;
	}
	
	protected void setSound(Sound sonido){
		this.sonido = sonido;
	}
	
	public Texture getTextura() {
		return dibujo;
	}
	
	protected void setTextura(Texture dibujo) {
		this.dibujo = dibujo;
	}
	
	protected void setVelocidadY(float velocidadY) {
		this.velocidadY = velocidadY;
	}
	
	protected float getVelocidadY() {
		return velocidadY;
	}
	
	protected void setVelocidadX(float velocidadY) {
		this.velocidadY = velocidadY;
	}
	
	protected float getVelocidadX() {
		return velocidadY;
	}
}

