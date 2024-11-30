package ru.liga.management.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.liga.management.model.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {

    @EntityGraph(attributePaths = {"leader"})
    List<Employee> findAll();

    @EntityGraph(attributePaths = {"leader"})
    Optional<Employee> findById(Long id);

    @EntityGraph(attributePaths = {"leader"})
    List<Employee> findAll(Specification<Employee> specification);
}