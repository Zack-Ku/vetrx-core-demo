package com.example.vertx.starter;

import io.vertx.core.AbstractVerticle;

/**
 * @author Zack
 * @date 2020/3/18
 */
public class VerticleDemo extends AbstractVerticle {

  // Called when verticle is deployed
  @Override
  public void start() {
    vertx.setPeriodic(1, id -> {
      // This handler will get called every second
      System.out.println(Thread.currentThread().getName() + " timer fired! in verticle");
    });
  }

  // Optional - called when verticle is undeployed
  @Override
  public void stop() {
  }

}
