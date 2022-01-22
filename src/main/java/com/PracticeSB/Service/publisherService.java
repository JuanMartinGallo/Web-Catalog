package com.PracticeSB.Service;

import java.util.List;

import com.PracticeSB.Domain.distribuidores;
import com.PracticeSB.Repository.PBRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class publisherService {
    
    @Autowired
    private PBRepository pbRepository;

    public List<distribuidores> findAll() {
        return pbRepository.findAll();
    }
}
