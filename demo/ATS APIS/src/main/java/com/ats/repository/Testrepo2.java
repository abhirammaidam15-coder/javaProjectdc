package com.ats.repository;

import com.ats.entity.Mongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Testrepo2 extends MongoRepository<Mongo,String>
{
//    public boolean findByNameAndId(String name , int id);




        Optional<Mongo> findByEmpId(int empId);


    boolean existsByNameAndPassword(String name, String password);
}
