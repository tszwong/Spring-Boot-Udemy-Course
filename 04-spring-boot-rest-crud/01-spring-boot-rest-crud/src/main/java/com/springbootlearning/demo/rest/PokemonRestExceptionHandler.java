package com.springbootlearning.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PokemonRestExceptionHandler {
    // add exception handling code here

    // add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<PokemonErrorResponse> handleException(PokemonNotFoundException exception) {
        // create a PokemonErrorResponse
        PokemonErrorResponse error = new PokemonErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value()); // 404
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        // return a ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // add another exception handler to catch all exceptions
    @ExceptionHandler
    public ResponseEntity<PokemonErrorResponse> handleException(Exception exception) {
        // create a PokemonErrorResponse
        PokemonErrorResponse error = new PokemonErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value()); // 400
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        // return a ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
