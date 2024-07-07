package com.veni.customerbasic.userapp.Repository;

import com.veni.customerbasic.userapp.Entity.Voterdetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoterDetailsRepository extends JpaRepository<Voterdetails, Integer> {

    Voterdetails findByUsername(String username);

    Voterdetails findByEmail(String email);

    @Override
    Optional<Voterdetails> findById(Integer id);
}
