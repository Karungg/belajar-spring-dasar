package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.data.Foo;

@SpringBootTest
public class ScopeConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testScope() {
        Foo foo = context.getBean("fooScope", Foo.class);
        Foo foo1 = context.getBean("fooScope", Foo.class);

        Assertions.assertNotSame(foo, foo1);
    }

    @Test
    void testCustomScope() {
        Foo foo1 = context.getBean("fooDoubleton", Foo.class);
        Foo foo2 = context.getBean("fooDoubleton", Foo.class);
        Foo foo3 = context.getBean("fooDoubleton", Foo.class);
        Foo foo4 = context.getBean("fooDoubleton", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo3, foo4);
        Assertions.assertSame(foo1, foo3);
        Assertions.assertSame(foo2, foo4);
    }
}
