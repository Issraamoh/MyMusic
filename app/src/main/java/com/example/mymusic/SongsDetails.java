package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SongsDetails extends AppCompatActivity {
TextView songName,songDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_details);
        SongData currentSong=(SongData) getIntent().getExtras().getSerializable("DetailsOBj") ;

        songName=findViewById(R.id.textName);
        songDetail=findViewById(R.id.details_text);
        songName.setText(currentSong.name);
        songDetail.setText(currentSong.details);

    }
}
