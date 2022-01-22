package com.PracticeSB.Controllers;

import com.PracticeSB.Domain.videogames;
import com.PracticeSB.Service.publisherService;
import com.PracticeSB.Service.videoGamesService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CRUDController {

    private publisherService publisherService;
    private videoGamesService videoGamesService;

    public CRUDController(publisherService publisherService, videoGamesService videoGamesService) {
        this.publisherService = publisherService;
        this.videoGamesService = videoGamesService;
    }


    @RequestMapping("/videogames/create")
    public String showFormCreate(Model model) {
        model.addAttribute("publishers", publisherService.findAll());
        model.addAttribute("newgame", new videogames());
        return "formVideoGames";
    }

    @PostMapping("/videogames/save")
    public String saveVideoGame(videogames videogame) {
        videoGamesService.saveGame(videogame);
        return "redirect:/";
    }
        
}

