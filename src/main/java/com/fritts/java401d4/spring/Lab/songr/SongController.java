package com.fritts.java401d4.spring.Lab.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String getSongs(Model model){
        Iterable<Song> songs = songRepository.findAll();
        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/songs/new")
    public String getAddAlbumForm() {
        return "SongForm";
    }

    @PostMapping("/songs")
    public RedirectView addNewAlbum(@RequestParam String title, @RequestParam int length, @RequestParam int trackNumber, @RequestParam Album album) {
        Song song = new Song(title, length, trackNumber, album);
        songRepository.save(song);
        return new RedirectView("/songs");
    }
}
