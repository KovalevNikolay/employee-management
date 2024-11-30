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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.liga.management.model.enums.EmployeeStatus;
import ru.liga.management.model.enums.Grade;
import ru.liga.management.model.enums.Role;

import java.time.LocalDate;

@Entity
@Table(schema = "management", name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leader_id")
    private Employee leader;

    @Column(name = "external_manager")
    private String externalManager;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "comment")
    private String comment;

    @Column(name = "is_internal")
    private Boolean isInternal;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
}
