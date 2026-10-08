package com.ats.repository;

import com.ats.entity.Testentity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Test2 extends JpaRepository<Testentity,Integer> {
public void existsByNameAndPassword(String name,String password);
}
