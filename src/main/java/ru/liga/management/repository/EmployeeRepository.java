package ru.liga.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.liga.management.model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
