package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.repository.CategoryRepository;
import belajarspringdasar.belajar_spring_dasar.repository.CustomerRepository;
import belajarspringdasar.belajar_spring_dasar.repository.ProductRepository;
import belajarspringdasar.belajar_spring_dasar.service.CategoryService;
import belajarspringdasar.belajar_spring_dasar.service.CustomerService;
import belajarspringdasar.belajar_spring_dasar.service.ProductService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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

    @Test
    void testSetterDependency() {
        CategoryService categoryService = context.getBean(CategoryService.class);
        Assertions.assertNotNull(categoryService.getCategoryRepository());

        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);

    }

    @Test
    void testFieldDependency() {
        CustomerService customerService = context.getBean(CustomerService.class);
        Assertions.assertNotNull(customerService.getNormalCustomerRepository());

        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        Assertions.assertSame(customerService.getNormalCustomerRepository(), customerRepository);

    }

    @Test
    void testQualifier() {
        CustomerService customerService = context.getBean(CustomerService.class);

        CustomerRepository normalCustomer = customerService.getNormalCustomerRepository();
        CustomerRepository PremiumCustomer = customerService.getPremiumCustomerRepository();

        Assertions.assertNotSame(normalCustomer, PremiumCustomer);
    }
}