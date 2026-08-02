package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record AgentId(UUID val) implements Serializable {
    public AgentId{
        Objects.requireNonNull(val, "Agent ID can not be null");
    }

    public static AgentId generate(){
        return new AgentId(UUID.randomUUID());
    }

    public static AgentId from(String val){
        return new AgentId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
