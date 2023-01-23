package com.example.drinker.dao;

import com.example.drinker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<Customer,Integer> {
    public Customer findByLoginAndAndPassword(String login, String password);
}
