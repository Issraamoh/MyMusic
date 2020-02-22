package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        final ArrayList<SongData> songsArrayList = new ArrayList<SongData>();
        songsArrayList.add(new SongData("Nirvana","Sam Smith"));
        songsArrayList.add(new SongData("Pray","Sam Smith"));
        songsArrayList.add(new SongData("Bailando","Enrique Iglesias"));
        songsArrayList.add(new SongData("Just give me a reason","P!nk"));
        songsArrayList.add(new SongData("Loco","Enrique Iglesias"));
        songsArrayList.add(new SongData("Inconsolable","BSB"));
        songsArrayList.add(new SongData("Love came here","Lhasa De Sela"));

        SongsAdapter itemsAdapter =
                new SongsAdapter(this, songsArrayList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int postion
                    , long l) {
                Intent intent=new Intent(Songs.this,SongsDetails.class);
                intent.putExtra("DetailsOBj",songsArrayList.get(postion));
                startActivity(intent);
            }
        });


    }
}
