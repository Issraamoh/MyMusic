package com.example.mymusic;

import java.io.Serializable;

public class SongData implements Serializable {
    String name,details;

    public SongData(String name, String details) {
        this.name = name;
        this.details = details;
    }
}
