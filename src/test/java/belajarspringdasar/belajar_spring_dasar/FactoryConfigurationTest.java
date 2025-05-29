package belajarspringdasar.belajar_spring_dasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajarspringdasar.belajar_spring_dasar.client.PaymentGatewayClient;

@SpringBootTest
public class FactoryConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testPaymentGatewayClient() {
        PaymentGatewayClient client = context.getBean("paymentGatewayClient", PaymentGatewayClient.class);

        Assertions.assertEquals("https://payment/", client.getEndpoint());
        Assertions.assertEquals("PUBLIC", client.getPublicKey());
        Assertions.assertEquals("PRIVATE", client.getPrivateKey());
    }
}
