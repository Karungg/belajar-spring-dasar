package belajarspringdasar.belajar_spring_dasar.client;

import lombok.Data;

@Data
public class PaymentGatewayClient {
    private String endpoint;

    private String publicKey;

    private String privateKey;
}
