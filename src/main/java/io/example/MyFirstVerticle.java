package io.example;

import io.vertx.core.AbstractVerticle;

/**
 * MyFirstVerticle
 * Created by XL on 2018/1/9.
 */
public class MyFirstVerticle extends AbstractVerticle {
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello World!");
        }).listen(8080);
    }
}
