package com.spring.learning.controller;

import com.spring.learning.factory.Pet;
import com.spring.learning.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AppController {

    @Autowired
    PetFactory petFactory;

    @GetMapping
    public String getDefault() {
        return "{\"message\": \"Hello World 123\"}";
    }

    @PostMapping("adoptPet/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
        Pet adoptedPet = petFactory.adoptPet(type, name);
        adoptedPet.feed();
        return adoptedPet;
    }
}
