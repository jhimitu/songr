package com.jhia.lab11.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Album model
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageUrl;

    public Album() {

    }

    public Album(
        String title,
        String artist,
        int songCount,
        int length,
        String imageUrl
    ) { }
}