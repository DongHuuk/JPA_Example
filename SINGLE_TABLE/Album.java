package com.back.example.springboot.jpa.dongexample.Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("Album")
@PrimaryKeyJoinColumn(name = "ALBUM_ID")
public class Album extends Item{

    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
