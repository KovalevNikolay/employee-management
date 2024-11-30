package ru.liga.management.model.dto.request;

import java.time.LocalDate;

public record EmployeeRequest(String firstName,
                              String lastName,
                              String middleName,
                              String role,
                              String grade,
                              Long leaderId,
                              String externalManager,
                              LocalDate birthDate,
                              String comment,
                              Boolean isInternal,
                              String status) {
}
