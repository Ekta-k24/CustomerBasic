package com.veni.customerbasic.userapp.Controller;

import com.veni.customerbasic.userapp.Entity.Voterdetails;
import com.veni.customerbasic.userapp.Repository.VoterDetailsRepository;
import com.veni.customerbasic.userapp.model.Voter_details_dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoterDetailsController {

    @Autowired
    VoterDetailsRepository voterDetailsRepository;

    @GetMapping("/voter")
    public Voter_details_dto getVoterDetails(@RequestParam int id) {
        return transform(voterDetailsRepository.findById(id).orElse(null));
    }


    private Voter_details_dto transform(Voterdetails voterdetails) {
        return new Voter_details_dto(voterdetails.getFullName(), voterdetails.getVoterId(),voterdetails.getAge(),voterdetails.getPhone());
    }
}
