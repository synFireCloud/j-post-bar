package io.github.synfirecloud.jpb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by fc on 8/25/16.
 */
@ComponentScan
@EnableAutoConfiguration
public class MainConfig {
  public static void main(String[] args) {
    SpringApplication.run(MainConfig.class, args);
  }
}
