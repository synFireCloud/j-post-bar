package io.github.synfirecloud.jpb.controller;

import io.github.synfirecloud.jpb.MainConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fc on 8/25/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT,classes = MainConfig.class)
public class UserControllerTest {
  @Autowired
  private TestRestTemplate rest;

  @Test
  public void mine(){
    String response = rest.getForObject("/user/mine",String.class);
    Assert.assertEquals(response,"HelloWorld");
  }
}
