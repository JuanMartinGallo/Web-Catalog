package com.PracticeSB.Service;

import com.PracticeSB.Domain.Videogames;

import com.PracticeSB.Repository.VGRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class VideoGamesService {

    @Autowired
    private VGRepository vgRepo;
        
    
    public List<Videogames> searchHighlights() {
        return vgRepo.findGames();
    }

    public List<Videogames> searchDistributor(int distributor) {
        return vgRepo.findPublisher(distributor);
    }

    public List<Videogames> search(String search) {
        return vgRepo.findByNameContaining(search);
    }

    public Videogames saveGame(Videogames videogame) {
        return vgRepo.save(videogame);
    }
}
