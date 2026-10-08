package com.ats.service;

import com.ats.entity.Tripdetailes;
import com.ats.repository.*;
import com.ats.entity.Billing;
import com.ats.entity.Employdetailes;
import com.ats.entity.Mongo;
import com.ats.entity.*;
import com.ats.dto.Detailes;
import com.ats.dto.Savedto;
import com.ats.repository.LoginMethod;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.*;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@Service
@NoArgsConstructor

public class Test {
    @Autowired
   private LoginMethod loginRepositary;
    @Autowired
    private Employes employes;
    @Autowired
   private com.ats.repository.Billing billingRepository;
    @Autowired
  private Testrepo2 testrepo2;
    @Autowired
   private Second secrepository;
   @Autowired
  private Logos logosrepo;
   @Autowired
  private Detailes detailesdto;
    @Autowired
private RedisTemplate<String, Object> redisTemplate;
@Autowired
Tripdetailees tripdetailees;
    public void detailers(Employdetailes employdetailes) {
        Employdetailes result = employes.save(employdetailes);
    }

    public Employdetailes find(String name, String email) {
        return employes.findByNameAndEmail(name, email);
    }

    public int autoupdate(int id, String phno) {

        int response = employes.updateByNameAndId(id, phno);
        if (response != 0) {
            return response;
        } else {
            return 0;
        }
    }

    public void delete(int id, String email) {
        employes.deleteByIdAndEmail(id, email);
    }

    public Employdetailes saveall(Employdetailes employdetailes) {
        employdetailes = employes.save(employdetailes);
        return employdetailes;
    }

    public Employdetailes updaterole(Employdetailes employdetailes) {
        Employdetailes id = employes.findById(employdetailes.getId()).orElse(null);
        if (id == null) {
            return null;
        } else {
            employdetailes.setRole(employdetailes.getRole());
            return employes.save(employdetailes);

        }

    }

    public Employdetailes updatename(Employdetailes employdetailes) {
        Employdetailes e = employes.findById(employdetailes.getId()).orElse(null);

        if (e == null) {
            return null;
        } else {
            e.setName(employdetailes.getName());
            return employes.save(e);
        }
    }

    public String logindetails(int empId, String name, String password) {
        try {

//
//            Optional<Mongo> m = testrepo2.findById(String.valueOf(id));
//
//            String name1 = m.get().getName();
//            String password1 = m.get().getPassword();

//            Optional<Mongo> m = testrepo2.findById(String.valueOf(id));

            Optional<Mongo> m = testrepo2.findByEmpId(empId);

            if (m.isEmpty()) {
                return "User not found";
            }

            Mongo user = m.get();

            String name1 = user.getName();
            String password1 = user.getPassword();


            if (name.equals(name1) && password.equals(password1)) {
                return "sucessesful";
            } else {
                return "unsucessesful";
            }
        } catch (Exception e) {
            e.getStackTrace();
            return "not found :)";
        }
    }

    public List get() {
        List<Secret> li1 = secrepository.findAll();
        return li1;
    }

    public Double caluclate(Detailes detailesdto) {
        Boolean s = false;
        Optional<Billing> data = billingRepository.findByCustomerId(detailesdto.getCustomerId());
        double avg = 0;
        System.out.print(data);
        if(data.isPresent()) {
            avg = 0.0;

            Double units = detailesdto.getUnitsConsumed();

            if (units > 0 && units < 100) {

                avg = units * 2;
                String key = "data1:"+ detailesdto.getCustomerId();
                redisTemplate .opsForValue().set(key,avg);
            } else if (units > 100 && units <= 300) {
                avg = units * 4;
                    redisTemplate.opsForValue().set("avdetailsdto.getCustomerId()",avg);
            } else {

                avg = units * 6;
                redisTemplate.opsForValue().set("avdetailsdto.getCustomerId()",avg);
            }

            Billing billingEntity = data.get();
            billingEntity.setPrice(avg);
            billingRepository.save(billingEntity);
            return avg;
        } else {
            return avg;
        }
    }

    @CachePut(value = "save",key = "#id")
    public List<Savedto> saved(int id, String name, String password){
        Savedto savedto = new Savedto();
        savedto.setId(id);
        savedto.setName(name);


        savedto.setPassword(password);
      logosrepo.save(savedto);
      return logosrepo.findAll();
    }

    public Page<Employdetailes>get(int page,int size){
        Pageable Page = (Pageable) PageRequest.of(page,size);
      return employes.findAll(Page);
    }

    public Tripdetailes savee(Tripdetailes tripdetailes){
        return tripdetailees.save(tripdetailes);

    }
@Cacheable(value = "tripdetails",key="#id")
    public Tripdetailes gett(String id) {

        return tripdetailees.findById(id)
                .orElse(null);
    }

}
