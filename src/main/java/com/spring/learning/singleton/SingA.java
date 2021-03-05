package com.spring.learning.singleton;

public class SingA {

  private static SingA singA;

  private SingA() {
    super();
  }

  public static SingA getInstance() {
    if (null == singA) {
      synchronized (SingA.class) {
        if (null == singA) {
          singA = new SingA();
        }
      }
    }
    return singA;
  }
}
