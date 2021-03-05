package com.spring.learning.prototype;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrototypeTest {

  @Autowired ProtoTrue protoTrue;
  @Autowired ProtoTrue protoTrue1;

  @Autowired ProtoFalse protoFalse;
  @Autowired ProtoFalse protoFalse1;

  @Test
  public void prototypeTest(){
    Assert.assertNotNull(protoTrue);
    Assert.assertNotNull(protoTrue1);
    Assert.assertNotNull(protoFalse);
    Assert.assertNotNull(protoFalse1);

    Assert.assertSame(protoTrue,protoTrue1);
    Assert.assertNotSame(protoFalse,protoFalse1);
  }
}
