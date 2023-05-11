package io.github.embedded.minio.core;

import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

public class MinioHandler {
    private final EmbeddedMinioConfig embeddedMinioConfig;

    public MinioHandler(EmbeddedMinioConfig embeddedMinioConfig) {
        this.embeddedMinioConfig = embeddedMinioConfig;
    }

    public void helloHandler(RoutingContext context) {
        HttpServerResponse response = context.response();
        response.putHeader("content-type", "text/plain");
        response.end("Hello from Minio!");
    }
}
