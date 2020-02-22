package com.example.mymusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class SongsAdapter extends ArrayAdapter<SongData> {


    public SongsAdapter(@NonNull Context context, @NonNull ArrayList<SongData> objects) {
        super(context, 0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_view, parent, false);
        }
        SongData currentSong = getItem(position);
        TextView songName = (TextView) listItemView.findViewById(R.id.song_text);

songName.setText(currentSong.name);

return listItemView;
    }
}
