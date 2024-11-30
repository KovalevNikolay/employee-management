package ru.liga.management.model.enums;

import lombok.Getter;

@Getter
public enum PaymentFrequency {
    MONTHLY("Раз в месяц"),           // Раз в месяц
    BI_MONTHLY("Раз в два месяца"),   // Раз в два месяца
    SEMI_MONTHLY("Два раза в месяц"), // Два раза в месяц
    QUARTERLY("Раз в квартал"),       // Раз в квартал
    ANNUALLY("Раз в год");            // Раз в год

    private final String displayName;

    PaymentFrequency(String displayName) {
        this.displayName = displayName;
    }
}