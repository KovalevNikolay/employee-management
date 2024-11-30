package ru.liga.management.model.dto.response;

import ru.liga.management.model.enums.EmployeeStatus;
import ru.liga.management.model.enums.Grade;
import ru.liga.management.model.enums.Role;

import java.time.LocalDate;

public record EmployeeResponse(Long id,
                               String firstName,
                               String lastName,
                               String middleName,
                               Role role,
                               Grade grade,
                               EmployeeResponse leader,
                               String externalManager,
                               LocalDate birthDate,
                               String comment,
                               Boolean isInternal,
                               EmployeeStatus status) {
}
