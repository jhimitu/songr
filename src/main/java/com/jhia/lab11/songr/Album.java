package com.jhia.lab11.songr;

import javax.persistence.Entity;

//Album model
@Entity
public class Album {
    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageUrl;

    public Album() {

    }
}
