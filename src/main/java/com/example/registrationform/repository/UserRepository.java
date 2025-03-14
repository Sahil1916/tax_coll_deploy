package com.example.registrationform.repository;

import com.example.registrationform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findAll = null;
  
   
     User  findByHomeNumber(String homeNumber);
     User  findByAadharNumber(String aadharNumber);
     User  findByPanNumber(String panNumber);
}