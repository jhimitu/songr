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
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;
    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @GetMapping("/albums/add")
    public String getAddAlbumForm() {
        return "addAlbumForm";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(
            String title,
            String artist,
            int songCount,
            int length,
            String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        System.out.println(album.title);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }
}
