package com.codewithsouma.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nowPlayingTxtVw = (TextView) findViewById(R.id.now_playing_textview);
        TextView songDetailsTxtVw = (TextView) findViewById(R.id.song_details_textview);
        TextView songLibraryTxtVw = (TextView) findViewById(R.id.song_library_textview);

        nowPlayingTxtVw.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick (View view){
                Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }

        });

        songDetailsTxtVw.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick (View view){
                Intent i = new Intent(MainActivity.this, SongDetailActivity.class);
                startActivity(i);
            }

        });

        songLibraryTxtVw.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick (View view){
                Intent i = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(i);
            }

        });

        Button explanationBtn = (Button) findViewById(R.id.button_explanation);
        explanationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "MAIN - \nShowcases your selectable activities.", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
