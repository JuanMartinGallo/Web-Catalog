package com.PracticeSB.Service;

import com.PracticeSB.Domain.videogames;

import com.PracticeSB.Repository.VGRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class videoGamesService {

    @Autowired

    private VGRepository vgRepo;
        
    
    public List<videogames> buscarDestacados() {
        return vgRepo.findGames();
    }

    public List<videogames> buscarDistribuidor(int distribuidor) {
        return vgRepo.findPublisher(distribuidor);
    }

    public List<videogames> search(String search) {
        return vgRepo.findByNameContaining(search);
    }

    public videogames saveGame(videogames videogame) {
        return vgRepo.save(videogame);
    }
}
