package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record MemoryId(UUID val) implements Serializable {
    public MemoryId{
        Objects.requireNonNull(val, "Memory ID can not be null");
    }

    public static MemoryId generate(){
        return new MemoryId(UUID.randomUUID());
    }

    public static MemoryId from(String val){
        return new MemoryId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
