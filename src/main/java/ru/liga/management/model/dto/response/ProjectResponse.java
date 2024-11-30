package ru.liga.management.model.dto.response;

public record ProjectResponse(Long id,
                              String name,
                              String lastName,
                              String firstName,
                              String middleName,
                              Boolean isInternal,
                              String chargeCode,
                              String status,
                              String comment) {
}