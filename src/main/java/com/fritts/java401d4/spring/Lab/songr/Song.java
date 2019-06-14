package com.fritts.java401d4.spring.Lab.songr;

import javax.persistence.*;

@Entity
public class Song {

                                        //all instance variables

    //serial primary key annoation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    //database relation annotation
    @ManyToOne()
    Album album;

    String title;
    int length;
    int trackNumber;

                                        //constructors
    public Song(){}
    public Song(String title, int length, int trackNumber, Album album){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

                                        //getters


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }
}
