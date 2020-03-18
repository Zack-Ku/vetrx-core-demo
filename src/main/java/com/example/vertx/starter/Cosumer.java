package com.example.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.eventbus.EventBus;

/**
 * @author Zack
 * @date 2020/3/18
 */
public class Cosumer extends AbstractVerticle {

  @Override
  public void start() {
    EventBus eb = vertx.eventBus();

    eb.consumer("test-topic", msg -> {
      System.out.println(Thread.currentThread().getName() + "" + msg.body());
    });


  }
}
