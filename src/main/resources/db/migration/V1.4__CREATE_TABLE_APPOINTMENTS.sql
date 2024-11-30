CREATE TABLE IF NOT EXISTS management.appointments
(
    id                       BIGSERIAL PRIMARY KEY,
    employee_id              BIGINT REFERENCES management.employees (id) NOT NULL,
    role                     VARCHAR(255)                                NOT NULL,
    grade                    VARCHAR(255)                                NOT NULL,
    project_id               BIGINT REFERENCES management.projects (id)  NOT NULL,
    start_date               DATE                                        NOT NULL,
    end_date                 DATE                                        NOT NULL,
    customers                VARCHAR(255)                                NOT NULL,
    responsible_for_feedback VARCHAR(255),
    partner                  VARCHAR(255),
    rate_partner             DECIMAL,
    condition                VARCHAR(255)                                NOT NULL,
    rate_nds                 DECIMAL,
    rate_no_nds              DECIMAL,
    percent                  DECIMAL,
    payment_frequency        VARCHAR                                     NOT NULL,
    comment                  TEXT,
    status                   VARCHAR                                     NOT NULL
)
