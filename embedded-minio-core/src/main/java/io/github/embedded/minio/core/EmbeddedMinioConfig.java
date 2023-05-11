package io.github.embedded.minio.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class EmbeddedMinioConfig {
    private int port;

    public boolean useSsl;

    public String keyStorePath;

    @ToString.Exclude
    public String keyStorePassword;

    public String trustStorePath;

    @ToString.Exclude
    public String trustStorePassword;

    public EmbeddedMinioConfig() {
    }

    public EmbeddedMinioConfig port(int port) {
        this.port = port;
        return this;
    }

    public EmbeddedMinioConfig useSsl(boolean useSsl) {
        this.useSsl = useSsl;
        return this;
    }

    public EmbeddedMinioConfig keyStorePath(String keyStorePath) {
        this.keyStorePath = keyStorePath;
        return this;
    }

    public EmbeddedMinioConfig keyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
        return this;
    }

    public EmbeddedMinioConfig trustStorePath(String trustStorePath) {
        this.trustStorePath = trustStorePath;
        return this;
    }

    public EmbeddedMinioConfig trustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
        return this;
    }
}
