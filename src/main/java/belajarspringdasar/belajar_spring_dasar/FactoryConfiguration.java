package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajarspringdasar.belajar_spring_dasar.factory.PaymentGatewayClientFactory;

@Configuration
@Import(value = {
        PaymentGatewayClientFactory.class
})
public class FactoryConfiguration {

}
