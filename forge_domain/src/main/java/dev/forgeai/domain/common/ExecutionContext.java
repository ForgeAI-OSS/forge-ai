package dev.forgeai.domain.common;

import dev.forgeai.domain.identity.ExecutionId;
import dev.forgeai.domain.identity.UserId;
import dev.forgeai.domain.identity.WorkflowId;

import java.time.Instant;
import java.util.Map;

public record ExecutionContext(
        ExecutionId executionId,
        WorkflowId workflowId,
        UserId userId,
        Instant sharedAt,
        Map<String, Object> metadata
) {
}
