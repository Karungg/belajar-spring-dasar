package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajarspringdasar.belajar_spring_dasar.service.AuthService;

@SpringBootTest
public class AwareTest {
    @Configuration
    @Import(value = {
            AuthService.class
    })
    public static class TestConfiguration {
    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(AuthService.class);
        context.registerShutdownHook();
    }

    @Test
    void testAware() {
        AuthService authService = context.getBean(AuthService.class);
        Assertions.assertEquals("authService", authService.getBeanName());
        Assertions.assertSame(authService.getContext(), context);
    }
}
