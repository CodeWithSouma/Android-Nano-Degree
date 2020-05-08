package com.codewithsouma.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SongDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        TextView nowPlayingTxtVw = (TextView) findViewById(R.id.textview_now_playing_navigation);
        TextView songLibraryTxtVw = (TextView) findViewById(R.id.textview_song_library_navigation);

        nowPlayingTxtVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongDetailActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }

        });

        songLibraryTxtVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongDetailActivity.this, SongListActivity.class);
                startActivity(i);
            }

        });

        Button explanationBtn = (Button) findViewById(R.id.button_explanation);
        explanationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SongDetailActivity.this, "SONG DETAILS - \nShows currently selected song biographical information. Musicbrainz has API for music information.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}