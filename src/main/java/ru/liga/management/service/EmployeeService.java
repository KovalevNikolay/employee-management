package ru.liga.management.service;

import ru.liga.management.model.dto.request.EmployeeRequest;
import ru.liga.management.model.dto.response.EmployeeResponse;

import java.util.Optional;

public interface EmployeeService {

    Optional<EmployeeResponse> findById(Long id);

    EmployeeResponse create(EmployeeRequest dto);

    EmployeeResponse update(EmployeeRequest dto);
}
