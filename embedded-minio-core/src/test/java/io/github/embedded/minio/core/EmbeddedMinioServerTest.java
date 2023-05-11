package io.github.embedded.minio.core;

import org.junit.jupiter.api.Test;

public class EmbeddedMinioServerTest {
    @Test
    public void testMinioServerBoot() throws Exception {
        EmbeddedMinioServer server = new EmbeddedMinioServer();
        server.start();
        server.close();
    }
}
