package com.mygdx.game;

public class ProbabilidadGotaRoja implements StrategyProbabilidades{
	DirectorElemento director;
	ElementoBuilder builder;
	
	public Elemento crear() {
	    director = new DirectorElemento();
	    builder = new ElementoBuilder();
	    
		director.buildGotaRoja(builder);
		
		return builder.Elemento();
	}
}
