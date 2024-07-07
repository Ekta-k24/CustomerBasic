package com.veni.customerbasic.old.data;

import com.veni.customerbasic.old.model.Customer;
import com.veni.customerbasic.old.model.Address;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataStore {

    List<Customer> customerList = new ArrayList<>();

    public DataStore() {

        Customer customer1 = new Customer();
        Address address1 = new Address();

        Customer customer2 = new Customer();
        Address address2 = new Address();

        Customer customer3 = new Customer();
        Address address3 = new Address();

        customer1.setCid(1);
        customer1.setCname("first");
        customer1.setCPhone("123456789");

        address1.setStreet("ABCD");
        address1.setCity("Rajkot");
        address1.setState("Gujarat");
        address1.setZip("12345");

        customer1.setAddress(address1);


        customer2.setCid(2);
        customer2.setCname("second");
        customer2.setCPhone("987654321");

        address2.setStreet("Thaltej");
        address2.setCity("Ahmedabad");
        address2.setState("Gujarat");
        address2.setZip("16789");

        customer2.setAddress(address2);

        customer3.setCid(3);
        customer3.setCname("third");
        customer3.setCPhone("987654321");

        address3.setStreet("Borivali");
        address3.setCity("Mumbai");
        address3.setState("Maharastra");
        address3.setZip("12367");

        customer3.setAddress(address3);


        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);



    }

    public List<Customer> getCustomers() {
        return customerList;
    }
}
