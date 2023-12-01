package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class ElementoBuilder implements BuilderInterfaz {
	
	private int tipoElemento;
	private Rectangle hitbox;
	private Sound sonido;
	private Texture dibujo;
	private float velocidadX;
	private float velocidadY;

	public void tipoElemento(int tipoElemento) {
		this.tipoElemento = tipoElemento;
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
	
	public void VelocidadY(float velocidad) {
		this.velocidadY = velocidad;
	}
	
	public void VelocidadX(float velocidad) {
		this.velocidadX = velocidad;
	}
	
	public Elemento Elemento() {
		
		Elemento elem;
		
		if(tipoElemento == 0) {
			elem = new GotaAzul(hitbox, sonido, dibujo, velocidadX, velocidadY);
		}
		else {
			if(tipoElemento == 1) {
				elem = new GotaRoja(hitbox, sonido, dibujo, velocidadX, velocidadY);
			}
			else {
				elem = new Meteorito(hitbox, sonido, dibujo, velocidadX, velocidadY);
			}
		}
		
		return elem;
	}

}