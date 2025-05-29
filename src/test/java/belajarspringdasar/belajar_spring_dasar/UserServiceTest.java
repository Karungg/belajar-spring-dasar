package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajarspringdasar.belajar_spring_dasar.listener.LoginSuccessListener;
import belajarspringdasar.belajar_spring_dasar.service.UserService;

@SpringBootTest
public class UserServiceTest {
    @Configuration
    @Import(value = {
            LoginSuccessListener.class,
            UserService.class
    })
    public static class TestConfiguration {
    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testLoginSuccessListener() {
        UserService userService = context.getBean(UserService.class);
        userService.login("miftah", "rahasia");
        userService.login("miftah", "gila");
        Assertions.assertTrue(userService.login("miftah", "rahasia"));
    }
}
