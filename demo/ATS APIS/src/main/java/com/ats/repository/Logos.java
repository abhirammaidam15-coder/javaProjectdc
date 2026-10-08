package com.ats.repository;

import com.ats.dto.Savedto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Logos extends MongoRepository<Savedto,Integer> {

}
