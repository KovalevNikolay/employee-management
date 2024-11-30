package ru.liga.management.model.dto.response;

public record ChargeCodeResponse(Long id,
                                 AppointmentResponse appointment,
                                 String fromChargeCode,
                                 String toChargeCode,
                                 Boolean isProfit) {
}
