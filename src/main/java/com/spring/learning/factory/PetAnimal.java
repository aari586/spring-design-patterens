package com.spring.learning.factory;

public abstract class PetAnimal {

  public String name;

  public String type;

  public boolean hungry = true;

  public boolean adopted = false;

  public abstract String sound();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isHungry() {
    return hungry;
  }

  public void setHungry(boolean hungry) {
    this.hungry = hungry;
  }

  public boolean isAdopted() {
    return adopted;
  }

  public void setAdopted(boolean adopted) {
    this.adopted = adopted;
  }
}
