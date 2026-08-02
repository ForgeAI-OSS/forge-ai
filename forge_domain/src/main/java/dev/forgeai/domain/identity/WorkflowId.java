package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record WorkflowId(UUID val) implements Serializable {
    public WorkflowId{
        Objects.requireNonNull(val, "Workflow ID can not be null");
    }

    public static WorkflowId generate(){
        return new WorkflowId(UUID.randomUUID());
    }

    public static WorkflowId from(String val){
        return new WorkflowId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
