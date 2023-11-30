package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class GotaBuilder implements BuilderInterfaz {
	
	private int tipoGota;
	private Rectangle hitbox;
	private Sound sonido;
	private Texture dibujo;
	private float velocidad;
	

public void tipoGota(int tipoGota) {
	this.tipoGota = tipoGota;
}
	
public void Hitbox(Rectangle hitbox) {
	this.hitbox = hitbox;
}

public void Sonido(Sound sonido) {
	this.sonido = sonido;
}

public void Dibujo(Texture dibujo) {
	this.dibujo = dibujo;
}

public void Velocidad(float velocidad) {
	this.velocidad = velocidad;
}

public Gota Gota() {
	if(tipoGota == 1) {
		return new GotaAzul(hitbox, sonido, dibujo, velocidad);
	}
	else {
		return new GotaRoja(hitbox, sonido, dibujo, velocidad);
	}
	
}