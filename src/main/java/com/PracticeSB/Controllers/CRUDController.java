package com.PracticeSB.Controllers;

import com.PracticeSB.Domain.Videogames;
import com.PracticeSB.Service.PublisherService;
import com.PracticeSB.Service.VideoGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CRUDController {

    @Autowired
    private PublisherService publisherService;
    @Autowired
    private VideoGamesService videoGamesService;

    public CRUDController(PublisherService publisherService, VideoGamesService videoGamesService) {
        this.publisherService = publisherService;
        this.videoGamesService = videoGamesService;
    }

    @RequestMapping("/videogames/create")
    public String showFormCreate(Model model) {
        model.addAttribute("publishers", publisherService.findAll());
        model.addAttribute("newgame", new Videogames());
        return "formVideoGames";
    }

    @PostMapping("/videogames/save")
    public String saveVideoGame(Videogames videogame) {
        videoGamesService.saveGame(videogame);
        return "redirect:/";
    }
        
}

