package ru.liga.management.model.enums;

import lombok.Getter;

@Getter
public enum AppointmentStatus {

    ASSIGNED("Назначен"),
    IN_PROGRESS("В процессе"),
    COMPLETED("Завершено"),
    CANCELLED("Отменено");

    private final String displayName;

    AppointmentStatus(String displayName) {
        this.displayName = displayName;
    }

}
