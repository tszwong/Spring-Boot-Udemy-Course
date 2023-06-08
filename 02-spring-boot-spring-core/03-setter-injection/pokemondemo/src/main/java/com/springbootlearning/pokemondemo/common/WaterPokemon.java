package com.springbootlearning.pokemondemo.common;

import org.springframework.stereotype.Component;

@Component // marks the class as a Spring bean, makes it available for dependency injection
public class WaterPokemon implements Pokemon {
    @Override
    public String getDailyPokemon() {
        return "You get a Squirtle and a Wartortle";
    }
}
