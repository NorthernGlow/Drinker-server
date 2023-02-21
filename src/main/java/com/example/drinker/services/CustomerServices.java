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
        if (customer != null) {
            customerDAO.save(customer);
        } else {
            throw new Exception();
        }
    }

    public String authorization(Customer customer) {
        Customer user = customerDAO.findByLoginAndAndPassword(customer.getLogin(), customer.getPassword());
        if (user != null) {
            return Integer.toString(user.getId());
        }
        return "false";
    }

    public Customer getCustomerById(int id) {
        return customerDAO.findById(id).get();
    }
}
