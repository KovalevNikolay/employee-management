package ru.liga.management.repository.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import ru.liga.management.model.dto.filter.EmployeeFilter;
import ru.liga.management.model.entity.Employee;
import ru.liga.management.model.enums.EmployeeStatus;
import ru.liga.management.model.enums.Grade;
import ru.liga.management.model.enums.Role;
import ru.liga.management.repository.PredicateUtil;

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
public class EmployeeSpecification {

    public Specification<Employee> withFilter(EmployeeFilter filter) {
        return (root, query, cb) ->
                PredicateUtil.builder()
                        .add(filter.firstName(), value -> asString(root, cb, firstName, value))
                        .add(filter.lastName(), value -> asString(root, cb, lastName, value))
                        .add(filter.role(), value -> asEnum(root, cb, role, Role.class, value))
                        .add(filter.grade(), value -> asEnum(root, cb, grade, Grade.class, value))
                        .add(filter.leaderId(), value -> cb.equal(root.get(leader).get(id), value))
                        .add(filter.externalManager(), value -> asString(root, cb, externalManager, value))
                        .add(filter.isInternal(), value -> cb.equal(root.get(isInternal), value))
                        .add(filter.status(), value -> asEnum(root, cb, status, EmployeeStatus.class, value))
                        .build(cb);
    }

    private Predicate asString(Root<Employee> root, CriteriaBuilder cb, String field, String value) {
        return cb.like(cb.lower(root.get(field)), "%" + value.toLowerCase() + "%");
    }

    private <E extends Enum<E>> Predicate asEnum(Root<Employee> root,
                                                 CriteriaBuilder criteriaBuilder,
                                                 String field,
                                                 Class<E> enumClass,
                                                 String value) {
        if (value == null) {
            return criteriaBuilder.conjunction();
        }

        E enumValue = Enum.valueOf(enumClass, value);
        return criteriaBuilder.equal(root.get(field), enumValue);
    }
}
