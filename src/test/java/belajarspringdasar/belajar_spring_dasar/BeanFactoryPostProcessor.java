package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajarspringdasar.belajar_spring_dasar.data.Foo;
import belajarspringdasar.belajar_spring_dasar.processor.FooBeanFactoryPostProcessor;

@SpringBootTest
public class BeanFactoryPostProcessor {
    @Configuration
    @Import(value = {
            FooBeanFactoryPostProcessor.class
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
    void testFooBeanPostProcessor() {
        Foo foo = context.getBean("fooAnjas", Foo.class);
        Assertions.assertNotNull(foo);
    }

}
