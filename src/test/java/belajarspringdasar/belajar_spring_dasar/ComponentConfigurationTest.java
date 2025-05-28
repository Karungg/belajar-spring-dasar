package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.repository.ProductRepository;
import belajarspringdasar.belajar_spring_dasar.service.ProductService;

@SpringBootTest
public class ComponentConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService product = context.getBean(ProductService.class);

        Assertions.assertNotNull(product);
    }

    @Test
    void testConstructorDependency() {
        ProductService productService = context.getBean(ProductService.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Assertions.assertNotNull(productService);
        Assertions.assertNotNull(productRepository);
    }
}