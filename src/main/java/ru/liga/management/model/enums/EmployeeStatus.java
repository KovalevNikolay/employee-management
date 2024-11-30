package ru.liga.management.model.enums;

import lombok.Getter;

@Getter
public enum EmployeeStatus {
    ACTIVE("Активен"),
    TERMINATED("Уволен");

    private final String displayName;

    EmployeeStatus(String displayName) {
        this.displayName = displayName;
    }
}
