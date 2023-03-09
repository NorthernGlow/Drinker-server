package com.example.drinker.services;

import com.example.drinker.dao.CustomerDAO;
import com.example.drinker.models.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

    public void addMainPhoto(int id, MultipartFile photo) throws IOException {
        Customer customer = customerDAO.findById(id).get();
        String namePhoto = customer.getName() + "_" + customer.getId() + "_photo.png";
        String pathToSaveFile = System.getProperty("user.home") + File.separator + "IdeaProjects" + File.separator + "Drinker" + File.separator + "src" + File.separator + "photo" + File.separator + namePhoto;
        photo.transferTo(new File(pathToSaveFile));
        customer.setPhoto(namePhoto);
        customerDAO.save(customer);
    }

    public void updateCustomer(int id, Customer customer) {
        Customer c = customerDAO.findById(id).get();
        c.setName(customer.getName());
        c.setSurname(customer.getSurname());
//        c.setPhoto(customer.getPhoto());
//        c.setEmail(customer.getEmail());
        customerDAO.save(c);
    }
}
