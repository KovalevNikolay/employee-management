CREATE TABLE IF NOT EXISTS management.charge_code
(
    id               BIGSERIAL PRIMARY KEY,
    appointment_id   BIGINT REFERENCES management.appointments (id) NOT NULL,
    from_charge_code VARCHAR(255),
    to_charge_code   VARCHAR(255),
    is_profit        BOOLEAN
)