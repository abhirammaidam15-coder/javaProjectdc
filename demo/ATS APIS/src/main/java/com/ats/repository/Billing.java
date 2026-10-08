package com.ats.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Billing extends MongoRepository<com.ats.entity.Billing,Integer> {


    public<optional> Optional<com.ats.entity.Billing> findByCustomerId(int i);
}
