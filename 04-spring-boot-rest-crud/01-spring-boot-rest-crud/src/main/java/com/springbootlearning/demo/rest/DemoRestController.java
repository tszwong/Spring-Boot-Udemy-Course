package com.springbootlearning.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class DemoRestController {
    // add code for the "/squirtle" endpoint

    @GetMapping("/squirtle")
    public String saySquirtle() {
        return "Squirtle";
    }
}
