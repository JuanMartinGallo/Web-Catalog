package com.PracticeSB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.PracticeSB.Domain.distribuidores;

@Repository

public interface PBRepository extends JpaRepository<distribuidores, Integer> {

   
}
    

