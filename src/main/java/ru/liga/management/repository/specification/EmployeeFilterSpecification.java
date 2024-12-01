package ru.liga.management.repository.specification;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import ru.liga.management.model.dto.filter.EmployeeFilter;
import ru.liga.management.model.entity.Employee;
import ru.liga.management.model.enums.EmployeeStatus;
import ru.liga.management.model.enums.Grade;
import ru.liga.management.model.enums.Role;

import static ru.liga.management.model.entity.Employee.Fields.externalManager;
import static ru.liga.management.model.entity.Employee.Fields.firstName;
import static ru.liga.management.model.entity.Employee.Fields.grade;
import static ru.liga.management.model.entity.Employee.Fields.id;
import static ru.liga.management.model.entity.Employee.Fields.isInternal;
import static ru.liga.management.model.entity.Employee.Fields.lastName;
import static ru.liga.management.model.entity.Employee.Fields.leader;
import static ru.liga.management.model.entity.Employee.Fields.role;
import static ru.liga.management.model.entity.Employee.Fields.status;

@Component
@RequiredArgsConstructor
public class EmployeeFilterSpecification {

    private final FilterHelper filterHelper;

    public Specification<Employee> withFilter(EmployeeFilter filter) {
        return (root, query, cb) ->
                PredicateHelper.builder()
                        .add(filter.firstName(), value -> filterHelper.stringContaining(root, cb, firstName, value))
                        .add(filter.lastName(), value -> filterHelper.stringContaining(root, cb, lastName, value))
                        .add(filter.role(), value -> cb.equal(root.get(role), Role.valueOf(value)))
                        .add(filter.grade(), value -> cb.equal(root.get(grade), Grade.valueOf(value)))
                        .add(filter.leaderId(), value -> cb.equal(root.get(leader).get(id), value))
                        .add(filter.externalManager(), value -> filterHelper.stringContaining(root, cb, externalManager, value))
                        .add(filter.isInternal(), value -> cb.equal(root.get(isInternal), value))
                        .add(filter.status(), value -> cb.equal(root.get(status), EmployeeStatus.valueOf(value)))
                        .build(cb);
    }
}