package com.example.vertx.starter;

import io.vertx.core.Context;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class MainVerticle {

  public static void main(String[] args) {

//    Vertx vertx = Vertx.vertx(new VertxOptions().setEventLoopPoolSize(1));
    Vertx vertx = Vertx.vertx();

//    vertx.setPeriodic(5000, id -> {
//      // This handler will get called every second
//      System.out.println(Thread.currentThread().getName() + " timer fired!1");
//    });

    DeploymentOptions options = new DeploymentOptions();
//    vertx.deployVerticle(VerticleDemo.class, options);
//
    vertx.deployVerticle(Cosumer.class, options);
    vertx.deployVerticle(Publisher.class, options);

    vertx.deployVerticle(ContextRunDemo.class, options);


    System.out.println(Thread.currentThread().getName() + " finish");

  }
}
