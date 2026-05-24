package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer save(Customer obj) {
        return repository.save(obj);
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }

    @Override
    public Customer getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer obj) {
        return repository.save(obj);
    }

    @Override
    public String delete(int id) {
        repository.deleteById(id);
        return "Deleted Successfully";
    }
}





