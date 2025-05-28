package belajarspringdasar.belajar_spring_dasar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import belajarspringdasar.belajar_spring_dasar.repository.CustomerRepository;
import lombok.Getter;

@Component
public class CustomerService {
    @Getter
    @Autowired
    private CustomerRepository customerRepository;
}
