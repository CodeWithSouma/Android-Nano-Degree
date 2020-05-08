package com.codewithsouma.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView albumImgVw = (ImageView) findViewById(R.id.album_imageview);

        albumImgVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(NowPlayingActivity.this, SongDetailActivity.class);
                startActivity(i);
            }

        });

        TextView songDetailsTxtVw = (TextView) findViewById(R.id.textview_song_details_navigation);
        TextView songLibraryTxtVw = (TextView) findViewById(R.id.textview_song_library_navigation);

        songDetailsTxtVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(NowPlayingActivity.this, SongDetailActivity.class);
                startActivity(i);
            }

        });

        songLibraryTxtVw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(NowPlayingActivity.this, SongListActivity.class);
                startActivity(i);
            }

        });

        Button explanationBtn = (Button) findViewById(R.id.button_explanation);
        explanationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NowPlayingActivity.this, "NOW PLAYING - \nShows currently selected song with music controls. Needs MediaPlayer API to play songs on the device.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
