package com.example.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;

/**
 * @author Zack
 * @date 2020/3/18
 */
public class ContextRunDemo extends AbstractVerticle {
  @Override
  public void start() throws Exception {
    context.put("verticleData", "verticle");
    context.runOnContext((v) -> {

//      if (context.isEventLoopContext()) {
//        System.out.println("Context attached to Event Loop");
//      } else if (context.isWorkerContext()) {
//        System.out.println("Context attached to Worker Thread");
//      } else if (context.isMultiThreadedWorkerContext()) {
//        System.out.println("Context attached to Worker Thread - multi threaded worker");
//      } else if (! Context.isOnVertxThread()) {
//        System.out.println("Context not attached to a thread managed by vert.x");
//      }

      System.out.println(Thread.currentThread().getName() + " context data:" + context.get("verticleData"));
      System.out.println(Thread.currentThread().getName() + " context data:" + context.get("mainData"));
    });
  }
}
