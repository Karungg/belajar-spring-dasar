package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CircularDependenciesConfigurationTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(CircularDependenciesConfiguration.class);
    }

    @Test
    void testCircularDependencies() {
        try {
            Assertions.fail("It must be fail because cyclic");
        } catch (BeansException exception) {
            exception.printStackTrace();
        }
    }
}
