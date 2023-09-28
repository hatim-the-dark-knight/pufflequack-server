package com.pufflequack.pufllequack.controller;

import org.springframework.data.jpa.repository.JpaRepository;


import jakarta.persistence.Id;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User,Id> {
    
}
