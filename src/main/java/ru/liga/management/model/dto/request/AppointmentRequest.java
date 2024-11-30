package ru.liga.management.model.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AppointmentRequest(Long employeeId,
                                 String role,
                                 Long projectId,
                                 String grade,
                                 LocalDate startDate,
                                 LocalDate endDate,
                                 String customers,
                                 String responsibleForFeedback,
                                 String partner,
                                 BigDecimal ratePartner,
                                 String condition,
                                 BigDecimal rateNds,
                                 BigDecimal rateNoNds,
                                 BigDecimal percent,
                                 String paymentFrequency,
                                 String comment,
                                 String status) {
}
