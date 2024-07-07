package com.veni.customerbasic.old.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
}
