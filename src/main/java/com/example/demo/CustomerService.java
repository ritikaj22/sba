package com.example.demo;


import java.util.List;


public interface CustomerService {

    Customer save(Customer obj);

    List<Customer> getAll();

    Customer getById(int id);

    Customer update(Customer obj);

    String delete(int id);
}

