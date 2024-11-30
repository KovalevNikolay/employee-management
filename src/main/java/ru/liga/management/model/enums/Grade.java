package ru.liga.management.model.enums;

import lombok.Getter;

@Getter
public enum Grade {
    INTERN("Стажёр"),
    JUNIOR("Джуниор"),
    MIDDLE("Миддл"),
    SENIOR("Синьор"),
    LEAD("Лид"),
    ARCHITECT("Архитектор");

    private final String displayName;

    Grade(String displayName) {
        this.displayName = displayName;
    }
}
