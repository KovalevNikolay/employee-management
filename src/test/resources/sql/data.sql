INSERT INTO management.employees (id,
                                  last_name,
                                  first_name,
                                  middle_name,
                                  role,
                                  grade,
                                  external_manager,
                                  birth_date,
                                  comment,
                                  is_internal,
                                  status,
                                  leader_id)
VALUES (1, 'Иванов', 'Иван', NULL, 'DEVELOPER', 'JUNIOR', NULL, '1985-05-20', NULL, TRUE, 'ACTIVE', 4),
       (2, 'Петрова', 'Анна', 'Сергеевна', 'TEAM_LEAD', 'LEAD', NULL, '1990-08-15', 'Работает над проектом X', TRUE, 'ACTIVE', 1),
       (3, 'Сидоров', 'Дмитрий', NULL, 'DEVOPS_ENGINEER', 'SENIOR', NULL, '1988-12-01', NULL, TRUE, 'ACTIVE', NULL),
       (4, 'Кузнецова', 'Ольга', NULL, 'DEVELOPER', 'SENIOR', NULL, '1992-03-10', 'Специалист по UX/UI', TRUE, 'ACTIVE', 2);

SELECT SETVAL('management.employees_id_seq', (SELECT MAX(id) FROM management.employees));