package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.data.Connection;
import belajarspringdasar.belajar_spring_dasar.data.Server;

@SpringBootTest
public class LifeCycleTest {
    @Test
    void testLifeCycle() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        Connection connection = context.getBean(Connection.class);

        Assertions.assertNotNull(connection);

        context.close();
    }

    @Test
    void testLifeCycleServer() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();

        Server server = context.getBean(Server.class);

        Assertions.assertNotNull(server);

        context.close();
    }
}
