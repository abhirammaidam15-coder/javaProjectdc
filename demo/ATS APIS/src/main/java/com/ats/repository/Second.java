package com.ats.repository;

import com.ats.entity.Secret;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Second extends JpaRepository<Secret, Integer> {

}
