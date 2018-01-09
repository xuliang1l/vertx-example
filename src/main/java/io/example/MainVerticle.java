package io.example;

import io.vertx.core.AbstractVerticle;

/**
 * MainVerticle
 * Created by XL on 2018/1/9.
 */
public class MainVerticle extends AbstractVerticle {
    public void start() {
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}
