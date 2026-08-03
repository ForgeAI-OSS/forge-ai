package dev.forgeai.domain.tool;

import java.time.Duration;

public record ToolResponse(
        boolean success,
        Object result,
        String message,
        Duration executionTime
) {
}
