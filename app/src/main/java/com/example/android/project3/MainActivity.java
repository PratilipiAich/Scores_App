package com.example.android.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    /**
     * Displays the given score for Team A.
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.GeeksNSneaks_score);
        scoreView.setText(String.valueOf(score));


    }

    public void threePointsA(View view){
       scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);


    }
    public void twoPointsA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }
    public void freePointsA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.SoupaStars_score);
        scoreView.setText(String.valueOf(score));


    }

    public void threePointsB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);


    }
    public void twoPointsB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }
    public void freePointsB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }
}
