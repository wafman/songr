package com.fritts.java401d4.spring.Lab.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    AlbumRespository albumRespository;

    @GetMapping("/albums")
    public String getAllALbums(Model model){
        Iterable<Album> albums = albumRespository.findAll();
        model.addAttribute("albums", albums);
        return "albums";
    }

    @GetMapping("/albums/new")
    public String getAddAlbumForm() {
        return "AlbumForm";
    }

    @PostMapping("/albums")
    public RedirectView addNewAlbum(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String imageURL) {
        Album album = new Album(title, artist, songCount, length, imageURL);
        albumRespository.save(album);
        return new RedirectView("/albums");
    }

}
