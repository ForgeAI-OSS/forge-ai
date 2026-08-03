package dev.forgeai.domain.artifact;

import dev.forgeai.domain.identity.ArtifactId;

public record ArtifactMetadata(
        ArtifactId artifactId,
        ArtifactType artifactType,
        String name,
        String path
) {
}
