package com.mygdx.game;

public class ProbabilidadGotaAzul implements StrategyProbabilidades{
	DirectorElemento director;
	ElementoBuilder builder;
	
	public Elemento crear() {
	    director = new DirectorElemento();
	    builder = new ElementoBuilder();
	    
		director.buildGotaAzul(builder);
		
		return builder.Elemento();
	}
}
