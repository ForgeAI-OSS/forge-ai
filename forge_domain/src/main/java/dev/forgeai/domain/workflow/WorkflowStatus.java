package dev.forgeai.domain.workflow;

public enum WorkflowStatus {
    CREATED,
    READY,
    RUNNING,
    WAITING_FOR_APPROVAL,
    COMPLETED,
    FAILED,
    CANCELLED
}
