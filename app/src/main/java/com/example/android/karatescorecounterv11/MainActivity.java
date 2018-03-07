package com.example.android.karatescorecounterv11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team A
    float scoreTeamA = 0;

    // Tracks the score for Team B
    float scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 0.5 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 0.5f;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team A by 0.5 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 0.5f;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(float score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(float score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
