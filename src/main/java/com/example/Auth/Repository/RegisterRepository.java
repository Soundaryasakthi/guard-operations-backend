package com.example.Auth.Repository;
import com.example.Auth.model.Register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// @Repository

public interface RegisterRepository extends JpaRepository<Register, Long> {
    
    }