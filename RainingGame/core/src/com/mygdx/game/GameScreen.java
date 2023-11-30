package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameScreen implements Screen {
	final GameLluviaMenu game;
    private OrthographicCamera camera;
	private SpriteBatch batch;	   
	private BitmapFont font;
	//private Tarro tarro;
	private Lluvia lluvia;
	private Singleton singleton;
	   
	//boolean activo = true;

	public GameScreen(final GameLluviaMenu game) {
		this.game = game;
        this.batch = game.getBatch();
        this.font = game.getFont();
		  
     // creacion del tarro
          singleton = Singleton.getInstance(new Tarro());  
           
	     
	      lluvia = new Lluvia();
	      // creacion de la lluvia
	      lluvia.crear(); 
	      
	      camera = new OrthographicCamera();
	      camera.setToOrtho(false, 800, 480);
	      batch = new SpriteBatch();
	}

	@Override
	public void render(float delta) {
		
		
		//limpia la pantalla con color azul obscuro.
		ScreenUtils.clear(0, 0, 0.2f, 1);
		//actualizar matrices de la cámara
		camera.update();
		//actualizar 
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		//dibujar textos
		font.draw(batch, "Gotas totales: " + singleton.getValue().getPuntos(), 5, 475);
		font.draw(batch, "Vidas : " + singleton.getValue().getVidas(), 670, 475);
		font.draw(batch, "HighScore : " + game.getHigherScore(), camera.viewportWidth/2-50, 475);
		
	    if(!singleton.getValue().movimiento()) {
	    	if (!lluvia.actualizarMovimiento(singleton.getValue())) {
		    	  //actualizar HigherScore
		    	if (game.getHigherScore() < singleton.getValue().getPuntos()) {
		    		game.setHigherScore(singleton.getValue().getPuntos());  
		    	}
		    	//ir a la ventana de finde juego y destruir la actual
		    	if(!singleton.getValue().estaHerido()) {
		    		game.setScreen(new GameOverScreen(game));
		    	  	dispose();
		    	}
		    }
	    }
	    // Se dibuja el tarro y la lluvia
	    singleton.getValue().dibujar(batch);
		lluvia.actualizarDibujoLluvia(batch);
		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	  // continuar con sonido de lluvia
	  lluvia.continuar();
	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {
		lluvia.pausar();
		game.setScreen(new PausaScreen(game, this)); 
	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {
	  singleton.getValue().destruir();
      lluvia.destruir();

	}

}
