CREATE TABLE IF NOT EXISTS management.employees
(
    id               BIGSERIAL PRIMARY KEY,
    last_name        VARCHAR(255) NOT NULL,
    first_name       VARCHAR(255) NOT NULL,
    middle_name      VARCHAR(255),
    role             VARCHAR(255) NOT NULL,
    grade            VARCHAR(255) NOT NULL,
    external_manager VARCHAR(255),
    birth_date       DATE,
    comment          TEXT,
    is_internal      BOOLEAN      NOT NULL,
    status           VARCHAR      NOT NULL
)
