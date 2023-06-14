package com.springbootlearning.pokemondemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component // marks the class as a Spring bean, makes it available for dependency injection
//@Primary
public class WaterPokemon implements Pokemon {
    public WaterPokemon() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // defining the init method
    @PostConstruct
    public void startUp() {
        System.out.println("In startUp(): " + getClass().getSimpleName());
    }

    // defining the destroy method
    @PreDestroy
    public void cleanUp() {
        System.out.println("In cleanUp(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyPokemon() {
        return "You get a Squirtle and a Wartortle";
    }
}
