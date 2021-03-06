package com.spring.learning.adaptar;

public class AppleAdaptar implements Apple {
  private final Orange orange;

  public AppleAdaptar(Orange orange) {
    this.orange = orange;
  }

  @Override
  public String getVariety() {
    return orange.getVariety();
  }

  @Override
  public void eat() {
    orange.peel();
    orange.eat();
  }
}
