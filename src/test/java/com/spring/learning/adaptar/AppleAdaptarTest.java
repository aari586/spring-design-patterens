package com.spring.learning.adaptar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppleAdaptarTest {
  @Test
  public void testAdaptar() {
    Orange moro = new MoroOrange();
    Apple apple = new AppleAdaptar(moro);
    System.out.println(apple.getVariety());
    apple.eat();
  }
}
