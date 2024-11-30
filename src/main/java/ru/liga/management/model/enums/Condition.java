package ru.liga.management.model.enums;

import lombok.Getter;

@Getter
public enum Condition {
    FULL_TIME("Полная занятость"),
    PART_TIME("Частичная занятость"),
    TEMPORARY("Временный контракт"),
    PROBATION("Испытательный срок");

    private final String displayName;

    Condition(String displayName) {
        this.displayName = displayName;
    }

}