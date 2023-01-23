package com.example.drinker.services;

import com.example.drinker.dao.CustomerDAO;
import com.example.drinker.models.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServices {
    private CustomerDAO customerDAO;

    public void saveCustomer(Customer customer) throws Exception {
        if (customer != null){
            customerDAO.save(customer);
        }else {
            throw new Exception();
        }
    }

    public boolean authorization(Customer customer){
        return customerDAO.findByLoginAndAndPassword(customer.getLogin(), customer.getPassword()) != null;
    }
}
