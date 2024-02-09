package com.crm.controller;

import com.crm.entity.Customer;
import com.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/customer/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }
    @GetMapping("/customer")
    public Iterable<Customer> getCustomer(){
        return service.getAllCustomers();
    }

    @PutMapping("/customer/update/{id}")
    public Customer updateCustomer(@PathVariable("id") Integer id, @RequestBody Customer newCustomer){
        Customer customer = service.getCustomerbyId(id);
        customer.setFirstName(newCustomer.getFirstName());
        customer.setLastName(newCustomer.getLastName());
        customer.setEmail(newCustomer.getEmail());
        return service.updateCustomer(customer);
    }

    @DeleteMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id){
        service.deleteCustomer(id);
        return "Customer record deleted";
    }

}
