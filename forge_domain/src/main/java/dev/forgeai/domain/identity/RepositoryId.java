package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record RepositoryId(UUID val) implements Serializable {
    public RepositoryId{
        Objects.requireNonNull(val, "Repository ID can not be null");
    }

    public static RepositoryId generate(){
        return new RepositoryId(UUID.randomUUID());
    }

    public static RepositoryId from(String val){
        return new RepositoryId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
