package com.example.drinker.controllers;

import com.example.drinker.models.Customer;
import com.example.drinker.models.Location;
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
    public int saveCustomer(@RequestBody @Validated Customer customer) throws Exception {
       return customerServices.saveCustomer(customer);
    }

    @PostMapping("authorization")
    public int authorization(@RequestBody Customer customer) {
        return customerServices.authorization(customer);
    }

    @GetMapping("customer/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        return customerServices.getCustomerById(customerId);
    }


    @PutMapping("customer/{customerId}")
    public void addMainPhoto(@PathVariable int customerId, @RequestParam MultipartFile photo) throws IOException {
        customerServices.addMainPhoto(customerId, photo);
    }

    @PutMapping("customer/{customerId}/update")
    public void updateCustomer(@PathVariable int customerId, @RequestBody Customer customer) {
        customerServices.updateCustomer(customerId,customer);
    }


}
