package com.PracticeSB.Controllers;

import com.PracticeSB.Domain.videogames;
import com.PracticeSB.Service.videoGamesService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ListController {
    
    @Autowired

    private videoGamesService videoGamesService;

    @RequestMapping("/")
    public String listVideoGames(Model model) {
        List<videogames> destacados = videoGamesService.buscarDestacados();
        model.addAttribute("videoGames", destacados);
        return "listVideoGames";
    }
    
    @RequestMapping("/videogamesXpublishers")
    public String listVideoGamesXPublishers(int distribuidor, Model model) {
        List<videogames> games = videoGamesService.buscarDistribuidor(distribuidor);
        model.addAttribute("videoGames", games);
        return "listVideoGames";
    }

    @RequestMapping("/search")
    public String search(@RequestParam("q") String search, Model model) {
        List<videogames> games = videoGamesService.search(search);
        model.addAttribute("videoGames", games);
        return "listVideoGames";
    }
}
