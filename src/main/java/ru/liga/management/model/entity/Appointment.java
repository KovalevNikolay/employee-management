package ru.liga.management.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.liga.management.model.enums.AppointmentStatus;
import ru.liga.management.model.enums.Condition;
import ru.liga.management.model.enums.Grade;
import ru.liga.management.model.enums.PaymentFrequency;
import ru.liga.management.model.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@ToString(exclude = "chargeCodes")
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointments", schema = "planner")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "role")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "grade")
    private Grade grade;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "customers")
    private String customers;

    @Column(name = "responsible_for_feedback")
    private String responsibleForFeedback;

    @Column(name = "partner")
    private String partner;

    @Column(name = "rate_partner")
    private BigDecimal ratePartner;

    @Enumerated(EnumType.STRING)
    @Column(name = "condition")
    private Condition condition;

    @Column(name = "rate_nds")
    private BigDecimal rateNds;

    @Column(name = "rate_no_nds")
    private BigDecimal rateNoNds;

    @Column(name = "percent")
    private BigDecimal percent;

    @Column(name = "payment_frequency")
    @Enumerated(EnumType.ORDINAL)
    private PaymentFrequency paymentFrequency;

    @Column(name = "comment")
    private String comment;

    @Column(name = "status")
    private AppointmentStatus status;

    @OneToMany(mappedBy = "appointment")
    private List<ChargeCode> chargeCodes;
}
