package com.veni.customerbasic.userapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity
@Table(name = "voter_details")
public class Voterdetails {

    private int age;
    private String phone;
    private String fullName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voterId;

}
