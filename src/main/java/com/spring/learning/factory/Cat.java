package com.spring.learning.factory;

public class Cat extends PetAnimal implements Pet {

    public Cat(String name) {
        this.type = "Cat";
        this.name = name;
    }

    @Override
    public void feed() {
        this.hungry = false;
    }

    @Override
    public void adopt() {
        this.adopted = true;
    }

    @Override
    public String sound() {
        return "Meaw";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public boolean isHungry() {
        return super.isHungry();
    }

    @Override
    public boolean isAdopted() {
        return super.isAdopted();
    }
}
