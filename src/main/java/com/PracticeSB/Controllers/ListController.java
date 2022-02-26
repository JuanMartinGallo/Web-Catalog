package com.PracticeSB.Controllers;

import com.PracticeSB.Domain.Videogames;
import com.PracticeSB.Service.VideoGamesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListController {
    
    @Autowired

    private VideoGamesService videoGamesService;

    @RequestMapping("/")
    public String listVideoGames(Model model) {
        List<Videogames> highlights = videoGamesService.searchHighlights();
        model.addAttribute("VideoGames", highlights);
        return "listVideoGames";
    }
    
    @RequestMapping("/VideogamesXpublishers")
    public String listVideoGamesXPublishers(int distributor, Model model) {
        List<Videogames> games = videoGamesService.searchDistributor(distributor);
        model.addAttribute("VideoGames", games);
        return "listVideoGames";
    }

    @RequestMapping("/search")
    public String search(@RequestParam("q") String search, Model model) {
        List<Videogames> games = videoGamesService.search(search);
        model.addAttribute("VideoGames", games);
        return "listVideoGames";
    }
}
