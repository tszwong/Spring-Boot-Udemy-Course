package com.springbootlearning.demo.rest;

public class PokemonNotFoundException extends RuntimeException{
    public PokemonNotFoundException(String message) {
        super(message);
    }

    public PokemonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PokemonNotFoundException(Throwable cause) {
        super(cause);
    }
}
