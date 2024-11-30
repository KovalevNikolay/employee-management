package ru.liga.management.model.dto.response;

import ru.liga.management.model.enums.ProjectStatus;

public record ProjectResponse(Long id,
                              String name,
                              EmployeeResponse manager,
                              Boolean isInternal,
                              String chargeCode,
                              String comment,
                              ProjectStatus status) {
}