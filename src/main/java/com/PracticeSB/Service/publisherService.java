package com.PracticeSB.Service;

import java.util.List;

import com.PracticeSB.Domain.Distributors;
import com.PracticeSB.Repository.PBRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
    
    @Autowired
    private PBRepository pbRepository;

    public List<Distributors> findAll() {
        return pbRepository.findAll();
    }
}
