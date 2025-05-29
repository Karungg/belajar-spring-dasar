package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.data.Foo;
import belajarspringdasar.belajar_spring_dasar.data.FooBar;
import belajarspringdasar.belajar_spring_dasar.data.MultiFoo;

@SpringBootTest
public class OptionalDependencyConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(OptionalDependencyConfiguration.class);
    }

    @Test
    void testOptionalDependency() {
        Foo foo = context.getBean("fooOptional", Foo.class);
        FooBar fooBar = context.getBean("fooBarOptional", FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertNull(fooBar.getBar());
    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = context.getBean(MultiFoo.class);

        Assertions.assertEquals(1, multiFoo.getFoos().size());
    }
}
