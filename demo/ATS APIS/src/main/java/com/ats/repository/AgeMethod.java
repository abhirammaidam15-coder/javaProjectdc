package com.ats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgeMethod extends JpaRepository<com.ats.entity.AgeIdentifier,Integer> {

    Optional<com.ats.entity.AgeIdentifier> findByAge(int age);

}


