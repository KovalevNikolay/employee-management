package ru.liga.management.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.liga.management.model.dto.request.EmployeeRequest;
import ru.liga.management.model.dto.response.EmployeeResponse;
import ru.liga.management.model.mapper.EmployeeMapper;
import ru.liga.management.repository.EmployeeRepository;
import ru.liga.management.service.EmployeeService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public Optional<EmployeeResponse> findById(Long id) {
        return employeeRepository.findById(id)
                .map(employeeMapper::toResponse);
    }

    @Override
    @Transactional
    public EmployeeResponse create(EmployeeRequest dto) {
        return employeeMapper.toResponse(
                employeeRepository.save(employeeMapper.toEntity(dto))
        );
    }

    @Override
    @Transactional
    public EmployeeResponse update(EmployeeRequest dto) {
        return null;
    }
}
