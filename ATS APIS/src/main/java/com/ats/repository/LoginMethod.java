package com.ats.repository;

import com.ats.entity.LoginDetailes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMethod extends JpaRepository<LoginDetailes, Integer> {

    boolean existsByNameAndPassword(String name, String password);

}
