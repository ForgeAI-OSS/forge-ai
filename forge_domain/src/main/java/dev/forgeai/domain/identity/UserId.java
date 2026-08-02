package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record UserId(UUID val) implements Serializable {
    public UserId{
        Objects.requireNonNull(val, "User ID can not be null");
    }

    public static UserId generate(){
        return new UserId(UUID.randomUUID());
    }

    public static UserId from(String val){
        return new UserId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
