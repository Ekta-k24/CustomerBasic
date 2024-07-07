package com.veni.customerbasic.old.controller;

import com.veni.customerbasic.old.model.Customer;
import com.veni.customerbasic.old.model.Address;
import com.veni.customerbasic.old.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/get")
    public Customer getCustomerById(int id) {
        return customerService.getById(id);
    }

    @GetMapping("/get-all")
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public List<Customer> deleteCustomer(@PathVariable int id){
        return customerService.deleteCustomerById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer){
        System.out.println(customer);
        return customerService.updateNameById(id, customer.getCname());
    }

    @PutMapping("/{id}/address")
    public List<Customer> changeAddressById(@PathVariable int id, @RequestBody Address address){
        System.out.println(address);
        return customerService.changeAddressById(id, address);
    }


}
