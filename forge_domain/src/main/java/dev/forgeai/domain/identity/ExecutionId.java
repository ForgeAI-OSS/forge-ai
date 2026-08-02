package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record ExecutionId(UUID val) implements Serializable {
    public ExecutionId{
        Objects.requireNonNull(val, "Execution ID can not be null");
    }

    public static ExecutionId generate(){
        return new ExecutionId(UUID.randomUUID());
    }

    public static ExecutionId from(String val){
        return new ExecutionId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
