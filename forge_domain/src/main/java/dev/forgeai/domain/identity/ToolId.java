package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record ToolId(UUID val) implements Serializable {
    public ToolId{
        Objects.requireNonNull(val, "Tool ID can not be null");
    }
    public static ToolId generate(){
        return new ToolId(UUID.randomUUID());
    }
    public static ToolId from(String val){
        return new ToolId(UUID.fromString(val));
    }
    @Override
    public String toString(){
        return val.toString();
    }
}
