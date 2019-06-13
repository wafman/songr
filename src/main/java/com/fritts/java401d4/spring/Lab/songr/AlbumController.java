package com.fritts.java401d4.spring.Lab.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {

    @Autowired
    AlbumRespository albumRespository;

    @GetMapping("/album")
    public String getAllALbums(Model model){
        Iterable<Album> albums = albumRespository.findAll();
        model.addAttribute("albums", albums);
        return "album";
    }

}
