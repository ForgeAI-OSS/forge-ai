package dev.forgeai.domain.identity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record PluginId(UUID val) implements Serializable {
    public PluginId{
        Objects.requireNonNull(val, "Plugin ID can not be null");
    }

    public static PluginId generate(){
        return new PluginId(UUID.randomUUID());
    }

    public static PluginId from(String val){
        return new PluginId(UUID.fromString(val));
    }

    @Override
    public String toString(){
        return val.toString();
    }
}
