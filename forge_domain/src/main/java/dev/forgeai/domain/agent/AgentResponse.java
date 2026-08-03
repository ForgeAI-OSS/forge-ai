package dev.forgeai.domain.agent;

import dev.forgeai.domain.artifact.ArtifactMetadata;

import java.util.List;

public record AgentResponse(
        boolean success,
        List<ArtifactMetadata> artifacts,
        String summary
) {
}
