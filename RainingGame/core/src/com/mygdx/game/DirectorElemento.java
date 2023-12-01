package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

public class DirectorElemento {

	public void buildGotaAzul(ElementoBuilder builder) {
		builder.tipoElemento(0);
		builder.Hitbox(crearHitbox());
		builder.Dibujo(new Texture(Gdx.files.internal("gotaAzul.png")));
		builder.Sonido(Gdx.audio.newSound(Gdx.files.internal("drop.wav")));
		builder.VelocidadY(300 * Gdx.graphics.getDeltaTime());
		builder.VelocidadX(0);
	}
	
	public void buildGotaRoja(ElementoBuilder builder) {
		builder.tipoElemento(1);
		builder.Hitbox(crearHitbox());
		builder.Dibujo(new Texture(Gdx.files.internal("gotaRoja.png")));
		builder.Sonido(Gdx.audio.newSound(Gdx.files.internal("hurt.ogg")));
		builder.VelocidadY(300 * Gdx.graphics.getDeltaTime());
		builder.VelocidadX(0);
	}
	
	public void buildMeteorito(ElementoBuilder builder) {
		builder.tipoElemento(2);
		builder.Hitbox(crearHitbox());
		builder.Dibujo(new Texture(Gdx.files.internal("meteorito.png")));
		builder.Sonido(Gdx.audio.newSound(Gdx.files.internal("kbooooom.mp3")));
		builder.VelocidadX(50 * Gdx.graphics.getDeltaTime());
		builder.VelocidadY(400 * Gdx.graphics.getDeltaTime());
	}
	
	public Rectangle crearHitbox() {
		Rectangle hitbox = new Rectangle();
		hitbox.x = MathUtils.random(0, 800-64);
		hitbox.y = 480;
		hitbox.width = 64;
		hitbox.height = 64;
		return hitbox;
	}
}

