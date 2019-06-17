package com.jhia.lab11.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getAllSongs(Model m) {
        Iterable<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "allSongs";
    }

    @GetMapping("/songs/add")
    public String getAddSongForm() {
        return "addSongForm";
    }

    @PostMapping("/songs")
    public RedirectView addSong(
        @RequestParam String title,
        @RequestParam int length,
        @RequestParam int trackNumber,
        @RequestParam String album
    ) {
        List<Album> albumWithThatTitle = albumRepository.findByTitle(album);
        if (albumWithThatTitle.size() > 0) {
            Song song = new Song(title, length, trackNumber, albumWithThatTitle.get(0));
            songRepository.save(song);
            return new RedirectView("/songs");
        } else {
            Song song = new Song(title, length, trackNumber, new Album());
            songRepository.save(song);
            return new RedirectView("/songs");
        }
    }
}
