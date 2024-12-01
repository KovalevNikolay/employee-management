package ru.liga.management.repository.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Component;
import ru.liga.management.model.entity.Employee;

@Component
public class FilterHelper {

    private static final String WILDCARD = "%";

    public Predicate stringContaining(Root<Employee> root, CriteriaBuilder criteriaBuilder, String fieldName, String fieldValue) {
        return criteriaBuilder.like(criteriaBuilder.lower(root.get(fieldName)), wrapWithWildcards(fieldValue));
    }

    private String wrapWithWildcards(String fieldValue) {
        return WILDCARD + fieldValue.toLowerCase() + WILDCARD;
    }
}
