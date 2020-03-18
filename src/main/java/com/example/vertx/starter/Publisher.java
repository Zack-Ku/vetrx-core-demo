package com.example.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;

/**
 * @author Zack
 * @date 2020/3/18
 */
public class Publisher extends AbstractVerticle {

  @Override
  public void start() {
    EventBus eb = vertx.eventBus();

    vertx.setPeriodic(3000, id -> {
      // This handler will get called every second
      eb.send("test-topic", "hello world");
      System.out.println(Thread.currentThread().getName() + " send topic");
    });
  }
}
