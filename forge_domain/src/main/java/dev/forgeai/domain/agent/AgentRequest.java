package dev.forgeai.domain.agent;

import dev.forgeai.domain.common.ExecutionContext;

public record AgentRequest(
        ExecutionContext context,
        String objective
) {
}
