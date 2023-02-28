package com.example.drinker.controllers;

import com.example.drinker.models.Customer;
import com.example.drinker.services.CustomerServices;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@AllArgsConstructor
@RestController
@CrossOrigin
public class CustomerController {
    private CustomerServices customerServices;

    @PostMapping({"registration", "/"})
    public void saveCustomer(@RequestBody @Validated Customer customer) throws Exception {
        customerServices.saveCustomer(customer);
    }

    @PostMapping("authorization")
    public String authorization(@RequestBody Customer customer) {
        return customerServices.authorization(customer);
    }

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable int id) {
        return customerServices.getCustomerById(id);
    }

    @PutMapping("customer/{id}")
    public void addMainPhoto(@PathVariable int id, @RequestParam MultipartFile photo) throws IOException {
        customerServices.addMainPhoto(id, photo);
    }

    @PutMapping("customer/{id}/update")
    public void updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        customerServices.updateCustomer(id,customer);
    }
}
