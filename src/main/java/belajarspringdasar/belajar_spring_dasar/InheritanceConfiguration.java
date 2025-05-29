package belajarspringdasar.belajar_spring_dasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajarspringdasar.belajar_spring_dasar.service.MerchantServiceImpl;

@Configuration
@Import(value = {
        MerchantServiceImpl.class
})
public class InheritanceConfiguration {

}
