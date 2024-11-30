CREATE TABLE IF NOT EXISTS management.projects
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255)                                NOT NULL,
    manager_id  BIGINT REFERENCES management.employees (id) NOT NULL,
    is_internal BOOLEAN,
    charge_code VARCHAR,
    comment     TEXT,
    status      VARCHAR
)
