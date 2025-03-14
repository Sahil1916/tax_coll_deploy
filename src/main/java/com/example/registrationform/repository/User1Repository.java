package com.example.registrationform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.registrationform.model.user1;
import java.util.List;

public interface User1Repository extends JpaRepository<user1, Long> {
    List<user1> findByHomeNumber(String homeNumber); // Method to find members by home number

}