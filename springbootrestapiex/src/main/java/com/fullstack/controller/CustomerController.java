package com.fullstack.controller;

import com.fullstack.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

    List<Customer> customerList = Stream.of(new Customer(121, "SWARA", 98000.99),
            new Customer(122, "DIPAK", 91000.99),
            new Customer(123, "LAKSHMI", 45000.99)).toList();

    @GetMapping("/findall")
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerList);
    }
}
