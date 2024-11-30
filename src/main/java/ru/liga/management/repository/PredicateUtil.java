package ru.liga.management.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PredicateUtil {

    private final List<Predicate> predicates = new ArrayList<>();

    public static PredicateUtil builder() {
        return new PredicateUtil();
    }

    public <T> PredicateUtil add(T object, Function<T, Predicate> function) {
        if (object != null) {
            predicates.add(function.apply(object));
        }
        return this;
    }

    public Predicate build(CriteriaBuilder criteriaBuilder) {
        if (predicates.isEmpty()) {
            return criteriaBuilder.conjunction();
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}