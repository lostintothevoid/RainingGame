package com.mygdx.game;

public class ProbabilidadMeteorito implements StrategyProbabilidades{
	DirectorElemento director;
	ElementoBuilder builder;
	
	public Elemento crear() {
	    director = new DirectorElemento();
	    builder = new ElementoBuilder();
	    
		director.buildMeteorito(builder);
		
		return builder.Elemento();
	}
}
