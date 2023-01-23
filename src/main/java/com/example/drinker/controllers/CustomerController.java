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

    @PostMapping("registration")
    public void saveCustomer(@RequestBody @Validated Customer user) throws Exception {
        customerServices.saveCustomer(user);
    }

    @PostMapping("authorization")
    public String authorization(@RequestBody Customer customer){
        System.out.println(customerServices.authorization(customer));
        return new Boolean(customerServices.authorization(customer)).toString();
    }
}
