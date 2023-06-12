package com.springbootlearning.pokemondemo.common;

import org.springframework.stereotype.Component;

@Component
public class GrassPokemon implements Pokemon{
    @Override
    public String getDailyPokemon() {
        return "You get a Bulbasaur and Ivysaur";
    }
}
