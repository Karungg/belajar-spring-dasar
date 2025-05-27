package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.data.Connection;

@SpringBootTest
public class LifeCycleTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    void testLifeCycle() {
        Connection connection = context.getBean(Connection.class);

        Assertions.assertNotNull(connection);

        context.close();
    }
}
