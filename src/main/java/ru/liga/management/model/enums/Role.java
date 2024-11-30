package ru.liga.management.model.enums;

import lombok.Getter;

@Getter
public enum Role {
    DEVELOPER("Разработчик"),
    TESTER("Тестировщик"),
    PROJECT_MANAGER("Руководитель проекта"),
    BUSINESS_ANALYST("Бизнес-аналитик"),
    DEVOPS_ENGINEER("Инженер DevOps"),
    DESIGNER("Дизайнер"),
    PRODUCT_OWNER("Владелец продукта"),
    TEAM_LEAD("Руководитель группы"),
    QA_ENGINEER("Инженер по качеству");

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

}