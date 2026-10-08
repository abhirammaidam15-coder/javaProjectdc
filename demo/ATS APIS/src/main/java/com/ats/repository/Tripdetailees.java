package com.ats.repository;

import com.ats.entity.Tripdetailes;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Tripdetailees extends MongoRepository<Tripdetailes,String> {

    Object getById(int id);
}
