package com.example.drinker.controllers;

import com.example.drinker.models.Customer;
import com.example.drinker.services.CustomerServices;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin
public class CustomerController {
    private CustomerServices customerServices;

    @PostMapping({"registration","/"})
    public void saveCustomer(@RequestBody @Validated Customer customer) throws Exception {
        customerServices.saveCustomer(customer);
    }

    @PostMapping("authorization")
    public String authorization(@RequestBody Customer customer){
        System.out.println(customerServices.authorization(customer));
        return Boolean.toString(customerServices.authorization(customer));
    }

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable String id){
        return customerServices.getCustomerById(Integer.parseInt(id));
    }
}
