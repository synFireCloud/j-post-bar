package io.github.synfirecloud.jpb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fc on 8/25/16.
 */
@RestController
@RequestMapping("/user")
public class UserController {
  @RequestMapping("/mine")
  public String mine() {
    return "HelloWorld";
  }
}
