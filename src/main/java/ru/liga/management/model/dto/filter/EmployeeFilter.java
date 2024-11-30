package ru.liga.management.model.dto.filter;

public record EmployeeFilter(String firstName,
                             String lastName,
                             String role,
                             String grade,
                             Long leaderId,
                             String externalManager,
                             Boolean isInternal,
                             String status) {
}