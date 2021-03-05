package com.spring.learning.factory;

public class Dog extends PetAnimal implements Pet {

    public Dog(String name) {
        this.type = "Dog";
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
        return "Woof";
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
