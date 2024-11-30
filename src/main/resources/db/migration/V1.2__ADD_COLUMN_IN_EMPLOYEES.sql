
ALTER TABLE management.employees
    ADD COLUMN leader_id BIGINT,
    ADD CONSTRAINT fk_leader FOREIGN KEY (leader_id) REFERENCES management.employees (id);