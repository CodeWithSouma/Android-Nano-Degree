package com.codewithsouma.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String presentScoreOfTeamA;
    private String presentScoreOfTeamB;

    private static final String ZERO_POINT="0";
    private static final String ONE_POINT ="1";
    private static final String TWO_POINT ="2";
    private static final String THREE_POINT ="3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //at first we initilize the variable
        presentScoreOfTeamA=((TextView)findViewById(R.id.score_board_of_team_a)).getText().toString();
        presentScoreOfTeamB=((TextView)findViewById(R.id.score_board_of_team_b)).getText().toString();



    }


    //this method handel the score board
    public void scoreBoardHandler(View view) {

        if (view.getId()==R.id.add_one_point_of_team_a) {
            presentScoreOfTeamA=Integer.toString(Integer.parseInt(presentScoreOfTeamA) + Integer.parseInt(ONE_POINT));
            ((TextView) findViewById(R.id.score_board_of_team_a)).setText(presentScoreOfTeamA);
        }

        if (view.getId()==R.id.add_two_point_of_team_a) {
            presentScoreOfTeamA=Integer.toString(Integer.parseInt(presentScoreOfTeamA) + Integer.parseInt(TWO_POINT));
            ((TextView) findViewById(R.id.score_board_of_team_a)).setText(presentScoreOfTeamA);
        }

        if (view.getId()==R.id.add_three_point_of_team_a) {
            presentScoreOfTeamA=Integer.toString(Integer.parseInt(presentScoreOfTeamA) + Integer.parseInt(THREE_POINT));
            ((TextView) findViewById(R.id.score_board_of_team_a)).setText(presentScoreOfTeamA);
        }

        if (view.getId()==R.id.add_one_point_of_team_b) {
            presentScoreOfTeamB=Integer.toString(Integer.parseInt(presentScoreOfTeamB) + Integer.parseInt(ONE_POINT));
            ((TextView) findViewById(R.id.score_board_of_team_b)).setText(presentScoreOfTeamB);
        }

        if (view.getId()==R.id.add_two_point_of_team_b) {
            presentScoreOfTeamB=Integer.toString(Integer.parseInt(presentScoreOfTeamB) + Integer.parseInt(TWO_POINT));
            ((TextView) findViewById(R.id.score_board_of_team_b)).setText(presentScoreOfTeamB);
        }

        if (view.getId()==R.id.add_three_point_of_team_b) {
            presentScoreOfTeamB=Integer.toString(Integer.parseInt(presentScoreOfTeamB) + Integer.parseInt(THREE_POINT));
            ((TextView) findViewById(R.id.score_board_of_team_b)).setText(presentScoreOfTeamB);
        }



    }

    //reset button handler
    public void reset(View view) {

        presentScoreOfTeamA=ZERO_POINT;
        presentScoreOfTeamB=ZERO_POINT;
        ((TextView) findViewById(R.id.score_board_of_team_a)).setText(presentScoreOfTeamA);
        ((TextView) findViewById(R.id.score_board_of_team_b)).setText(presentScoreOfTeamB);


    }



}
