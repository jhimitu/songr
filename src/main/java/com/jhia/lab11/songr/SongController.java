package com.jhia.lab11.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @GetMapping("/songs")
    public String getAllSongs(Model m) {
        Iterable<Song> songs = songRepository.findAll();
        return "allSongs";
    }
}
