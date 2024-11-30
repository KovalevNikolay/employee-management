package ru.liga.management.model.enums;

import lombok.Getter;

@Getter
public enum ProjectStatus {
    ACTIVE("Активен"),
    COMPLETED("Завершен");

    private final String displayName;

    ProjectStatus(String displayName) {
        this.displayName = displayName;
    }
}