package com.jhia.lab11.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String getAllAlbums() {

    }
}
