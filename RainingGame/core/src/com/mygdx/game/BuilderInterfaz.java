package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public interface BuilderInterfaz {
	void tipoElemento(int tipoElemnto);
	void Hitbox(Rectangle hitbox);
	void Dibujo(Texture textura);
	void Sonido(Sound sonido);
	void VelocidadY(float velocidadY);
	void VelocidadX(float velocidadX);
}
