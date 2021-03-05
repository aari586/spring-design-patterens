package com.spring.learning.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonTest {
  @Autowired
  SingB singB1;

  @Autowired
  SingB singB2;

  @Test
  public void testSingletons(){
    SingA singA = SingA.getInstance();
    SingA singA1 = SingA.getInstance();

    // Test our own singleton
    Assert.assertNotNull("Object cannot be null for this test", singA);
    Assert.assertNotNull("Object cannot be null for this test", singA1);
    Assert.assertSame("The objects are singleton therefore must be same", singA, singA1);

    // Test spring singleton
    Assert.assertNotNull("Object cannot be null for this test", singB1);
    Assert.assertNotNull("Object cannot be null for this test", singB2);
    Assert.assertSame("The objects are singleton therefore must be same", singB1, singB2);
  }
}
