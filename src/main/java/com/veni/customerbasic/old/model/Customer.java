package com.veni.customerbasic.old.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Customer {
    private int cid;
    private String cname;
    private String cPhone;
    @Autowired
    private Address address;

}
