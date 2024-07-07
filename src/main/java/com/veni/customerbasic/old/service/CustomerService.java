package com.veni.customerbasic.old.service;

import com.veni.customerbasic.old.data.DataStore;
import com.veni.customerbasic.old.model.Address;
import com.veni.customerbasic.old.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {


    DataStore dataStore = new DataStore();

    // create a method to add customer -> POST
    public Customer addCustomer(Customer customer) {
        List<Customer> customers = dataStore.getCustomers();
        customers.add(customer);
        return customer;
    }

    // create a method to get customer by id -> GET
    public Customer getById(int id) {
        List<Customer> customers = dataStore.getCustomers();
        for(Customer customer : customers) {
            if(customer.getCid()==id){
                return customer;
            }
        }
        return null;
    }

    // create a method to get all customers -> GET
    public List<Customer> getAllCustomers() {
        return dataStore.getCustomers();
    }

    // create a method to update customer by id -> PUT
    public Customer updateNameById(int id, String newName) {
        List<Customer> customers = dataStore.getCustomers();
        for(Customer customer : customers) {
            if(customer.getCid()==id) {
                Customer currentCustomer = customer;
                customers.remove(currentCustomer);
                customer.setCname(newName);
                customers.add(customer);
                return customer;
            }
        }
        return null;
    }

    // create a method to delete customer by id  -> DELETE
    public List<Customer> deleteCustomerById(int id) {
        List<Customer> customers = dataStore.getCustomers();
        for(Customer customer : customers) {
            if(customer.getCid()==id) {
                customers.remove(customer);
                return customers;
            }
        }
        return null;
    }

    //create a method to change address by id
    public List<Customer> changeAddressById(int id, Address address) {
        List<Customer> customers = dataStore.getCustomers();
        for(Customer customer : customers) {
            if(customer.getCid()==id) {
            Customer currentCustomer = customer;
            customers.remove(currentCustomer);

            customer.setAddress(address);
            customers.add(customer);

            return customers;
            }
        }
        return null;
    }


}
