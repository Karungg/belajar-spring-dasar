package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.data.Foo;

@SpringBootTest
public class ScopeConfigurationTest {
    @Test
    void testScope() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);

        Foo foo = context.getBean("fooScope", Foo.class);
        Foo foo1 = context.getBean("fooScope", Foo.class);

        Assertions.assertNotSame(foo, foo1);
    }
}
