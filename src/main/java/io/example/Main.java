package io.example;

import io.vertx.core.Vertx;

/**
 * Main
 * Created by XL on 2018/1/9.
 */
public class Main {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}
