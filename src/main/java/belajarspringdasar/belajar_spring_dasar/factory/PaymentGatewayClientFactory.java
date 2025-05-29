package belajarspringdasar.belajar_spring_dasar.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import belajarspringdasar.belajar_spring_dasar.client.PaymentGatewayClient;

@Component(value = "paymentGatewayClient")
public class PaymentGatewayClientFactory implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://payment/");
        client.setPublicKey("PUBLIC");
        client.setPrivateKey("PRIVATE");
        return client;
    }
}
