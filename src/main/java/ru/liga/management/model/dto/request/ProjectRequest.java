package ru.liga.management.model.dto.request;

public record ProjectRequest(String name,
                             Long managerId,
                             Boolean isInternal,
                             String chargeCode,
                             String comment) {
}