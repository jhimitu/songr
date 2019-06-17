package com.jhia.lab11.songr;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

// sets up how Spring will interact with the database to retrieve/save/etc Albums
public interface AlbumRepository extends CrudRepository<Album, Long> {
    List<Album> findByTitle(String album);
}

