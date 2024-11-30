package ru.liga.management.model.dto.response;

import java.time.LocalDate;

public record EmployeeResponse(Long id,
                               String firstName,
                               String lastName,
                               String middleName,
                               String role,
                               String grade,
                               EmployeeResponse leader,
                               String externalManager,
                               LocalDate birthDate,
                               String comment,
                               Boolean isInternal,
                               String status) {
}
