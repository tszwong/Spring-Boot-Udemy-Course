package com.springbootlearning.pokemondemo.common;

public class FairyPokemon implements Pokemon {
    // no args constructor
    public FairyPokemon() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyPokemon() {
        return "You get a Jigglypuff and Wigglytuff";
    }
}
