package com.fritts.java401d4.spring.Lab.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRespository albumRespository;

    @Autowired
    SongRepository songRepository;

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

    @GetMapping("/albums/{id}")
    public String getAlbumById(@PathVariable Long id, Model model){
        Album album = albumRespository.findById(id).get();

        model.addAttribute("album", album);
        return "album";
    }


    @PostMapping("/albums")
    public RedirectView addNewAlbum(@RequestParam String title, @RequestParam String artist, @RequestParam int songCount, @RequestParam int length, @RequestParam String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRespository.save(album);
        return new RedirectView("/albums");
    }

}
