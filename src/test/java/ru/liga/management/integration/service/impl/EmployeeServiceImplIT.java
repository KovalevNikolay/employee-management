package ru.liga.management.integration.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.liga.management.integration.IntegrationTestBase;
import ru.liga.management.model.dto.response.EmployeeResponse;
import ru.liga.management.service.EmployeeService;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeServiceImplIT extends IntegrationTestBase {

    @Autowired
    private EmployeeService employeeService;


    @Test
    void shouldReturnEmployeeWithoutLeader() {
        Optional<EmployeeResponse> maybeEmployee = employeeService.findById(3L);
        assertThat(maybeEmployee).isPresent();
        assertThat(maybeEmployee.get().leader()).isNull();
    }

    @Test
    void shouldReturnEmployeeWithLeader() {
        Optional<EmployeeResponse> maybeEmployee = employeeService.findById(1L);
        assertThat(maybeEmployee).isPresent();
        EmployeeResponse employee = maybeEmployee.get();
        assertThat(employee.leader()).isNotNull();
        EmployeeResponse leader = employee.leader();
        assertThat(leader.leader()).isNull();
    }
}