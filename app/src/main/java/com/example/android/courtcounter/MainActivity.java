package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaring and initializing the variable scores for Teams A and B
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the player make +3 points.
     */
    public void add3PointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 3 ;
        displayForTeamA(scoreTeamA);
        }

    /**
     * This method is called when the player make +2 points.
     */
    public void add2PointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the player make +1 points.
     */
    public void add1PointTeamA(View view) {
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the player make +3 points.
     */
    public void add3PointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 3 ;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the player make +2 points.
     */
    public void add2PointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 2 ;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the player make +1 points.
     */
    public void add1PointTeamB(View view) {
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the game is over and Team A and B scores will be zero.
     */
    public void resetScores(View view) {
        scoreTeamA = 0 ;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0 ;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



}
