package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record ArtifactId(UUID val) implements Serializable {
    public ArtifactId{
        Objects.requireNonNull(val, "Artifact ID can not be null");
    }

    public static ArtifactId generate(){
        return new ArtifactId(UUID.randomUUID());
    }

    public static ArtifactId from(String val){
        return new ArtifactId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
