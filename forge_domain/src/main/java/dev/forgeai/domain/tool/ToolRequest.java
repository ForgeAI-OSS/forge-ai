package dev.forgeai.domain.tool;

import dev.forgeai.domain.common.ExecutionContext;

import java.util.Map;

public record ToolRequest(
        ExecutionContext context,
        String toolName,
        Map<String, Object> parameters
) {
}
