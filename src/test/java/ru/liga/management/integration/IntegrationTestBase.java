package ru.liga.management.integration;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.containers.PostgreSQLContainer;
import ru.liga.management.integration.annotation.IT;

@IT
@Sql("classpath:sql/data.sql")
public abstract class IntegrationTestBase {

    @ServiceConnection
    private static final PostgreSQLContainer<?> container = new PostgreSQLContainer<>("postgres:17.1");

    @BeforeAll
    static void runContainer() {
        container.start();
    }

//    @DynamicPropertySource
//    static void postgresProperties(DynamicPropertyRegistry registry) {
//        registry.add("spring.datasource.url", container::getJdbcUrl);
//    }
}
