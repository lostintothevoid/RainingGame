package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public interface BuilderInterfaz {
	BuilderInterfaz tipoElemento(int tipoElemnto);
	BuilderInterfaz Hitbox(Rectangle hitbox);
	BuilderInterfaz Dibujo(Texture textura);
	BuilderInterfaz Sonido(Sound sonido);
	BuilderInterfaz VelocidadY(float velocidadY);
	BuilderInterfaz VelocidadX(float velocidadX);
}
