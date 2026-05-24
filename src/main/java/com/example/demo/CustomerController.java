package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

    @Autowired
    private CustomerService service;

  

    @PostMapping("/add")
    public Customer addCustomer(@Valid @RequestBody Customer cust) {
        return service.save(cust);
    }

    

    @GetMapping("/all")
    public List<Customer> findAllCustomer() {
        return service.getAll();
    }

   

    @GetMapping("/find/{id}")
    public Customer findCustomerId(@PathVariable int id) {
        return service.getById(id);
    }

 

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer cust) {
        return service.update(cust);
    }

  

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return service.delete(id);
    }
    
}




/* Endpoints
Method		Endpoint					Purpose
POST		/api/v1/products/add		Add Product
GET			/api/v1/products/all		Get All Products
GET			/api/v1/products/find/1		Get Product By ID
PUT			/api/v1/products/update		Update Product
DELETE		/api/v1/products/delete/1	Delete Product
 */

