package com.veni.customerbasic.userapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voter_details_dto {
    private String fullName;
    private int voterId;
    private int age;
    private String phone;

}
