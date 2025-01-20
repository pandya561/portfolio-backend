package com.example.portfolio.Repostiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portfolio.Entity.contactEntity;

@Repository
public interface contactRepostiry extends JpaRepository<contactEntity,Long> {

    
} 
