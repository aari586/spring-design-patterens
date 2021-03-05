package com.spring.learning.factory;

import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class PetFactory {

    public Pet adoptPet(String type, String name){
        switch (type.toLowerCase(Locale.ROOT)){
            case "cat":
                return new Cat(name);
            case "dog":
                return new Dog(name);
            default:
                throw new UnsupportedOperationException("This kind of pet is not available");
        }
    }

}
