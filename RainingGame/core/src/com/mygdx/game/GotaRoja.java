package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class GotaRoja extends Gota{
	
	public GotaRoja() {
		super();
		dibujo = new Texture(Gdx.files.internal("gotaRoja.png"));
		sonido = Gdx.audio.newSound(Gdx.files.internal("hurt.ogg"));
	}
	
	@Override
	protected void efecto(Tarro tarro) {
		tarro.dañar();
		getSound().play();
	}
}
