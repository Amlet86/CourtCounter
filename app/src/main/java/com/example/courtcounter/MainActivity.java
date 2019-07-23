package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int totalScoreTeamA = 0;
    public int totalScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalScoreTeamA);
        displayForTeamB(totalScoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeScoreForTeamA(View view) {
        totalScoreTeamA = totalScoreTeamA + 3;
        displayForTeamA(totalScoreTeamA);
    }

    public void addTwoScoreForTeamA(View view) {
        totalScoreTeamA = totalScoreTeamA + 2;
        displayForTeamA(totalScoreTeamA);
    }

    public void addOneScoreForTeamA(View view) {
        totalScoreTeamA = totalScoreTeamA + 1;
        displayForTeamA(totalScoreTeamA);
    }

    public void addThreeScoreForTeamB(View view) {
        totalScoreTeamB = totalScoreTeamB + 3;
        displayForTeamB(totalScoreTeamB);
    }

    public void addTwoScoreForTeamB(View view) {
        totalScoreTeamB = totalScoreTeamB + 2;
        displayForTeamB(totalScoreTeamB);
    }

    public void addOneScoreForTeamB(View view) {
        totalScoreTeamB = totalScoreTeamB + 1;
        displayForTeamB(totalScoreTeamB);
    }

    public void reset(View view) {
        totalScoreTeamA = 0;
        totalScoreTeamB = 0;
        displayForTeamA(totalScoreTeamA);
        displayForTeamB(totalScoreTeamA);
    }

}
