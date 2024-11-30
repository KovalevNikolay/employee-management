package ru.liga.management.model.mapper;

import lombok.RequiredArgsConstructor;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;
import ru.liga.management.exception.EntityNotFoundException;
import ru.liga.management.model.entity.Employee;
import ru.liga.management.repository.EmployeeRepository;

@Named("EmployeeMapperUtil")
@Component
@RequiredArgsConstructor
public class EmployeeMapperUtil {

    private final EmployeeRepository employeeRepository;

    @Named("getEmployeeFromId")
    public Employee getEmployeeFromId(Long id) {
        if (id == null) {
            return null;
        }

        return employeeRepository.findById(id)
                .orElseThrow(
                        () -> new EntityNotFoundException("Сотрудник с идентификатором '%d' не найден.".formatted(id))
                );
    }
}
