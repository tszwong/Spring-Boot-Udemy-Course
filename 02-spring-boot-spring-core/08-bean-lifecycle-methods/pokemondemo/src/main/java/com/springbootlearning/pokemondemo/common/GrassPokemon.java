package com.springbootlearning.pokemondemo.common;

import org.springframework.stereotype.Component;

@Component
public class GrassPokemon implements Pokemon{
    public GrassPokemon() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyPokemon() {
        return "You get a Bulbasaur and Ivysaur";
    }
}
