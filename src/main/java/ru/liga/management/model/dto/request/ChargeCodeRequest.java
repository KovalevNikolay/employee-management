package ru.liga.management.model.dto.request;

public record ChargeCodeRequest(Long appointmentId,
                                String fromChargeCode,
                                String toChargeCode,
                                Boolean isProfit) {
}