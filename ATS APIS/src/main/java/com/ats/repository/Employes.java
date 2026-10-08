package com.ats.repository;

import com.ats.entity.Employdetailes;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Employes extends JpaRepository<Employdetailes, Integer>{

    public Employdetailes findByNameAndEmail(String name, String email);

    @Modifying
    @Transactional
    @Query("UPDATE Employdetailes e SET e.phno = :phno WHERE e.id = :id AND e.name = :name")
     int updateByNameAndId(@Param("id") int id,
                                 @Param("name") String name);

    public void deleteByIdAndEmail(int id, String email);

    @Modifying
    @Transactional
    @Query("UPDATE Employdetailes e SET e.role = :role WHERE e.id = :id")
    int updateById(@Param("id") int id,
                   @Param("role") String role);


}
