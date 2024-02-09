package com.crm.service;

import com.crm.dao.CustomerDao;
import com.crm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao dao;
    //Create
    public Customer addCustomer(Customer customer){
        return dao.save(customer);
    }
    //Display
    public Iterable<Customer> getAllCustomers(){
        return this.dao.findAll();
    }
    public Customer getCustomerbyId(Integer id){
        return this.dao.findById(id).get();
    }
    //Update
    public Customer updateCustomer(Customer customer){
        return dao.saveAndFlush(customer);
    }
    //Remove
    public void deleteCustomer(Integer id){
        dao.delete(getCustomerbyId(id));
    }
}
