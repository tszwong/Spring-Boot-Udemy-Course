package com.springbootlearning.pokemondemo;

import org.springframework.stereotype.Component;

@Component // marks the class as a Spring bean, makes it available for dependency injection
public class WaterPokemon implements Pokemon{
    @Override
    public String getDailyPokemon() {
        return "You get a Squirtle";
    }
}
