package com.mygdx.game;

public final class Singleton {
    private static Singleton instance;
    private Tarro value;

    private Singleton(Tarro value) {
        // The following code emulates slow initialization.
        /*
    	try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        */
        this.value = value;
    }

    public static Singleton getInstance(Tarro value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
    
    public Tarro getValue() {
    	return value;
    }
}