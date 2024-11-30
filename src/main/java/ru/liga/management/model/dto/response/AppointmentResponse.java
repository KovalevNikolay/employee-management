package ru.liga.management.model.dto.response;

import ru.liga.management.model.enums.AppointmentStatus;
import ru.liga.management.model.enums.Condition;
import ru.liga.management.model.enums.Grade;
import ru.liga.management.model.enums.PaymentFrequency;
import ru.liga.management.model.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AppointmentResponse(Long id,
                                  EmployeeResponse employee,
                                  Role role,
                                  ProjectResponse projectId,
                                  Grade grade,
                                  LocalDate startDate,
                                  LocalDate endDate,
                                  String customers,
                                  String responsibleForFeedback,
                                  String partner,
                                  BigDecimal ratePartner,
                                  Condition condition,
                                  BigDecimal rateNds,
                                  BigDecimal rateNoNds,
                                  BigDecimal percent,
                                  PaymentFrequency paymentFrequency,
                                  String comment,
                                  AppointmentStatus status) {
}